package jaeger.de.miel.car;


// Share implementations via Abstract class (not via an interface)
// We only share How via interface not What
public class Porsche extends AbstractCar implements Car {

    @Override
    public void drive() {
        System.out.println("Driving Porsche");
    }

    @Override
    public void brake() {
        System.out.println("Braking Porsche");
    }

    @Override
    public void steer() {
        System.out.println("Steering Porsche");
    }

    @Override
    public void park() {
        System.out.println("Parking Porsche");
        lock();
    }


}
