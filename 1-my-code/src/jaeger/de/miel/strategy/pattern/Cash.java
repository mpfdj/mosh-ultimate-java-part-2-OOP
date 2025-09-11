package jaeger.de.miel.strategy.pattern;

public class Cash implements PaymentStrategy {

    @Override
    public void processPayment(Payment payment) {
        String s = String.format("Paying %.2f using Cash", payment.getAmount());
        System.out.println(s);
    }
}
