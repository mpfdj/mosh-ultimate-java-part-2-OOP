package jaeger.de.miel.car;

public class Ferarri extends AbstractCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Ferarri");
    }

    @Override
    public void brake() {
        System.out.println("Braking Ferarri");
    }

    @Override
    public void steer() {
        System.out.println("Steering Ferarri");
    }

    @Override
    public void park() {
        System.out.println("Parking Ferarri");
        lock();
    }
}
