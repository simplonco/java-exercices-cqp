package exercices.lifegarage;


public abstract class Vehicle {

    protected String brand;
    protected Color color;
    protected float price;

    public abstract float getPriceWithTax();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                ", price=" + getPriceWithTax() +
                '}';
    }
}
