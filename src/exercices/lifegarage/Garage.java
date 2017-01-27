package exercices.lifegarage;


import java.util.ArrayList;
import java.util.List;

public class Garage {

    private String name;
    private List<Car> cars = new ArrayList<>();
    private List<Bike> bikes = new ArrayList<>();

    public Garage(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCar(List<Car> newCars) {
        cars.addAll(newCars);
    }

    public void addBike(List<Bike> newBikes) {
        bikes.addAll(newBikes);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                ", bikes=" + bikes +
                '}';
    }

}
