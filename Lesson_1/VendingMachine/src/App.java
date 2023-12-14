import java.util.ArrayList;
import java.util.List;

import domain.Bottle;
import domain.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("lays", 0, 0, "snack");
        Product item2 = new Product("twix", 0, 0, "chocolate");
        Product item3 = new Bottle("cola", 0, 0, "drink", 1.5);

        

        List <Product> assort = new ArrayList<>();

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        for (int i = 0; i < assort.size(); i++ ){
            System.out.println(assort.get(i));
        }

    }
}
