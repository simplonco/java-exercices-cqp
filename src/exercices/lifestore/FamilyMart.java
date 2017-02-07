package exercices.lifestore;


import java.util.ArrayList;
import java.util.List;

public class FamilyMart implements ConvenienceStore {

    private static final int STOCK_MAX = 2;
    private int worker;
    private List<Product> products = new ArrayList<>();

    public FamilyMart(int worker, List<Product> products) {
        this.worker = worker;
        this.products.addAll(products);
    }

    public int getWorker() {
        return worker;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setWorker(int worker) {
        this.worker = worker;
    }

    @Override
    public boolean sell(Product product) {
        boolean sold = false;
        boolean present = products.contains(product);
        if (present && worker >= 1) {
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
        return "FamilyMart{" +
                "worker=" + worker +
                ", products=" + products +
                '}';
    }
}
