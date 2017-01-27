package exercices.lifegarage;


import java.util.Arrays;
import java.util.List;

public class LifeGarage {

    public static void main(String[] args) {

        Garage garage = new Garage("garage");
        Car renault = new Car("renault", Color.RED, 999.9f);
        garage.addCar(renault);
        System.out.println(garage);

        Car peugeot = new Car("peugeot",Color.GREEN,1000f);
        Car volkswagen = new Car("volkswagen",Color.BLUE, 1500f);
        Car mercedes = new Car("mercedes",Color.RED, 2000.5f);
        List<Car> cars= Arrays.asList(peugeot,volkswagen,mercedes);
        garage.addCar(cars);
        System.out.println(garage);

        Bike harley = new Bike("harley", Color.RED, 800f);
        Bike ducati = new Bike("ducati", Color.BLUE, 1000f);
        Bike bmw = new Bike("bmw", Color.GREEN, 1999.9f);
        List<Bike> bikes = Arrays.asList(harley,ducati,bmw);
        garage.addBike(bikes);
        System.out.println(garage);


    }
}
