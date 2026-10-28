package br.com.zenon.fraud;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TransactionIngestor {
    List<Transaction> transactions = new ArrayList<>();
    private int limite;
    public TransactionIngestor(String fileName, int limite) throws IOException {
        Path filePath = Paths.get("data/" + fileName);
        this.limite = limite;


        if (Files.exists(filePath)) {
            IO.println("Arquivo existe");
            IO.println("lendo o Arquivo...");
            BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()));
            //FileReader fileReader = new FileReader(filePath.toFile());
            int i = 1;
            br.readLine();
            String linhaBruta;
            while ((linhaBruta = br.readLine()) != null) {

                if (i <= 1000) {
                    String[] pedaco = linhaBruta.split(",");

                    Transaction ts = new Transaction(

                            Integer.parseInt(pedaco[0]),
                            TransactionType.valueOf(pedaco[1].trim()),
                            new BigDecimal(pedaco[2]),
                            new TransactionCustomer(pedaco[3], new BigDecimal(pedaco[4]), new BigDecimal(pedaco[5])),
                            new TransactionCustomer(pedaco[6], new BigDecimal(pedaco[7]), new BigDecimal(pedaco[8])),
                            Boolean.parseBoolean(pedaco[9]),
                            Boolean.parseBoolean(pedaco[10])
                    );

                    transactions.add(ts);
                } else {
                    break;
                }
                i = i + 1;
            }
            br.close();
        } else {
            IO.println("Arquivo não existe");
        }

    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    public void imprime(List<Transaction> transactionsList) {
        int c1 = 0;

        for (Transaction tx : transactionsList) {
            if(c1 < this.limite) {
                c1 ++;
                IO.println(c1 + ": " + tx);

            }else{
                break;
            }

        }
    }
}