package jaeger.de.miel.strategy.pattern;

public class CreditCard implements PaymentStrategy {

    @Override
    public void processPayment(Payment payment) {
        String s = String.format("Paying %.2f using CreditCard", payment.getAmount());
        System.out.println(s);
    }
}
