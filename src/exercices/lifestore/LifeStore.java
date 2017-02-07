package exercices.lifestore;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LifeStore {

    public static void main(String[] args) {

        LifeStore lifeStore = new LifeStore();
        List<Product> products = lifeStore.readFile("src/exercices/ressources/Products.csv");
        ConvenienceStore distributor = new Distributor(products);
        Product aquarius = new Product("aquarius", 1.5f);
        boolean aquariusHasSold = distributor.sell(aquarius);
        System.out.println("aquariusHasSold:"+aquariusHasSold);
        boolean distributorFilled = distributor.filled();
        System.out.println("distributorFilled:"+distributorFilled);
        System.out.println(distributor);

        int worker = 1;
        FamilyMart familyMart = new FamilyMart(worker, products);
        boolean familyMartFilled = familyMart.filled();
        System.out.println("familyMartFilled:"+familyMartFilled);
        Product pocky = new Product("pocky", 4f);
        boolean pockyHasSold = familyMart.sell(pocky);
        System.out.println("pockyHasSold:"+pockyHasSold);
        familyMart.setWorker(0);
        Product evian = new Product("evian", 1f);
        boolean evianHasSold = familyMart.sell(evian);
        System.out.println("evianHasSold:"+evianHasSold);
        System.out.println(familyMart);

    }


    private List<Product> readFile(String filename) {
        String line;
        String separator = ",";
        List<Product> products = new ArrayList<>();
        try (
            BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String[] content = line.split(separator);
                Product productNew = new Product(content[0], Float.parseFloat(content[1]));
                products.add(productNew);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            return products;
        }
    }


}
