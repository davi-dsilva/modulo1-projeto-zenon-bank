package br.com.zenon;

import br.com.zenon.fraud.Transaction;
import br.com.zenon.fraud.TransactionType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Transaction transaction1 = new Transaction(1, TransactionType.PAYMENT,9839.64,"C1231006815", 170136.0, 160296.36,"M1979787155",0.0,0.0,0,0);

        Transaction transaction2 = new Transaction(743,TransactionType.CASH_OUT,850002.52,"C1280323807",850002.52, 0.0, "C873221189",6510099.11,7360101.63,1,0 );

        IO.println("Transação1: " + transaction1);
        IO.println("Transação2: " + transaction2);


    }
}
