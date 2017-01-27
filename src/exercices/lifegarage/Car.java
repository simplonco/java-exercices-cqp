package exercices.lifegarage;


public class Car extends Vehicle {

    public Car(String brand, Color color, float price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public float getPriceWithTax() {
        float tax = 2f;
        return this.price + tax;
    }
}
