package jaeger.de.miel.strategy.pattern;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Payment payment = new Payment(1_000.00f);
        paymentService.processPayment("cash", payment);
    }

}
