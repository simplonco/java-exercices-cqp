package exercices.lifestore;


import java.util.ArrayList;
import java.util.List;

public class Distributor implements ConvenienceStore {

    private static final int STOCK_MAX = 5;

    private List<Product> products = new ArrayList<>();

    public Distributor(List<Product> products) {

        this.products.addAll(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean sell(Product product) {
        boolean sold = false;
        boolean present = products.contains(product);
        if (present) {
            products.remove(product);
            sold = true;
        }
        return sold;
    }


    @Override
    public boolean filled() {
        boolean full = false;
        int stock = products.size();
        if (stock >= STOCK_MAX) {
            full = true;
        }
        return full;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "products=" + this.products +
                '}';
    }

}
