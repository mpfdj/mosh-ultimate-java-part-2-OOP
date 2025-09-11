package jaeger.de.miel.strategy.pattern;

public class Payment {
    private final float amount;

    public Payment(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }
}
