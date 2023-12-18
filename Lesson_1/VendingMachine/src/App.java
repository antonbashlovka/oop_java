import java.util.ArrayList;
import java.util.List;

import domain.Bottle;
import domain.Product;
import service.CoinDispencer;
import service.Display;
import service.Holder;
import service.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("lays", 100, 1, "snack");
        Product item2 = new Product("twix", 60, 5, "chocolate");
        Product item3 = new Bottle("cola", 70, 3, "drink", 0.5);

        List <Product> assort = new ArrayList<>();

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        Holder hold1 = new Holder();
        CoinDispencer cd1 = new CoinDispencer();
        Display disp1 = new Display(); 

        VendingMachine mach1 = new VendingMachine(hold1, cd1, disp1, assort);
        
        for (Product prod : mach1.getProducts()){
            System.out.println(prod);
        }



    }
}
