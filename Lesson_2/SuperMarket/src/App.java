import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Gena");
        Actor client2 = new OrdinaryClient("Luba");
        Actor client3 = new SpecialClient("Antoha", 1);        
        Actor client4 = new ActionClient("Vasya", 1, "NewYear");
        Actor client5 = new ActionClient("Oksana", 2, "NewYear");

        

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();

    }
}
