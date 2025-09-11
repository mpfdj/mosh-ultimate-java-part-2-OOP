package jaeger.de.miel.car;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Porsche();
        Car ferarri  = new Ferarri();

        Car[] cars = {porsche, ferarri};

        for (Car car : cars) {
            car.park();
        }

    }



}
