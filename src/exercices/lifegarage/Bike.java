package exercices.lifegarage;


public class Bike extends Vehicle{

    public Bike(String brand, Color color, float price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public float getPriceWithTax() {
        float tax = 1;
        return this.price + tax;
    }
}
