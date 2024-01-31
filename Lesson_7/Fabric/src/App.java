import Fabric.ItemGenerator;
import Fabric.GoldGenerator;
import Fabric.GemGenerator;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {

        ItemGenerator f2 = new GoldGenerator();
        f2.openReward();

        
        ItemGenerator f3 = new GemGenerator();
        f3.openReward();

        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());

        Random rnd = ThreadLocalRandom.current();
        
        for (int i=0; i<10; i++ ){
            int index = rnd.nextInt(2);
            generatorList.get(index).openReward();
        }


    }
}
