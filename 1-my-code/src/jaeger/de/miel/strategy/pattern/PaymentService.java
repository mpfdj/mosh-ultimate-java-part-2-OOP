package jaeger.de.miel.strategy.pattern;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private final Map<String, PaymentStrategy> paymentStrategyMap;

    public PaymentService() {
        paymentStrategyMap = new HashMap<>();
        paymentStrategyMap.put("cash", new Cash());
        paymentStrategyMap.put("creditcard", new CreditCard());
        paymentStrategyMap.put("paypal", new Paypal());
    }

// Instead of using below if statements use strategy pattern instead
//        if (paymentType.equals("creditcard")) {
//            processCreditCard(payment);
//        } else if (paymentType.equals("upi")) {
//            processUpi(payment);
//        } else if (paymentType.equals("crypto")) {
//            processCrypto(payment);
//        }


    public void processPayment(String type, Payment payment) {
        PaymentStrategy strategy = paymentStrategyMap.get(type);
        if (strategy == null) { throw new IllegalArgumentException("Unknown payment type: " + type); }
        strategy.processPayment(payment);
    }

}
