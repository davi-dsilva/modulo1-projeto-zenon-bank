package br.com.zenon.fraud;

public record Transaction( int step, TransactionType type,
        double amount, String nameOrig, double oldbalanceOrg,
        double newbalanceOri, String nameDest, double oldbalanceDes, double newbalanceDes, int isFraud, int isFlaggedFraud) {

   /*step, type    , amount , nameOrig     , oldbalanceOrg, newbalanceOrig, nameDest   , oldbalanceDest, newbalanceDest, isFraud, isFlaggedFraud
     1,     PAYMENT,  9839.64, C1231006815, 170136.0,       160296.36,       M1979787155,   0.0,            0.0,            0,          0*/
}
