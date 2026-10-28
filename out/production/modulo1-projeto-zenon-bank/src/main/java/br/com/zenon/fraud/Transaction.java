package br.com.zenon.fraud;

import java.math.BigDecimal;

public record Transaction (
        int step,
        TransactionType type,
        BigDecimal amount,

        TransactionCustomer origin,
        TransactionCustomer recipient,

        boolean isFraud,
        boolean isFlaggedFraud)  {
   /*step, type    , amount , nameOrig     , oldbalanceOrg, newbalanceOrig, nameDest   , oldbalanceDest, newbalanceDest, isFraud, isFlaggedFraud
     1,     PAYMENT,  9839.64, C1231006815, 170136.0,       160296.36,       M1979787155,   0.0,            0.0,            0,          0*/
}
