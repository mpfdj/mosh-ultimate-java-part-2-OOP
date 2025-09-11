package jaeger.de.miel.car;

public abstract class AbstractCar {
    protected void lock() {
        System.out.println("Locking the car");
    }
}
