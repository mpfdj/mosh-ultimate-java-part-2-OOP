package jaeger.de.miel.strategy.pattern;

public class Paypal implements PaymentStrategy {

    @Override
    public void processPayment(Payment payment) {
        String s = String.format("Paying %.2f using PayPal", payment.getAmount());
        System.out.println(s);
    }
}
