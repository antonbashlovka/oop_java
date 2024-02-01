import Cars.Automobile;
import Cars.Car;
import Cars.Truck;

public class App {
    public static void main(String[] args) throws Exception {
        

        //Наследование 1
        Automobile auto1 = new Truck("Kamaz_6520", 75, "Самосвал");
        System.out.println(auto1.allowedSpeed);

        //Наследование 2
        Automobile auto2 = new Car("Lada_2112", 140, 200);
        System.out.println(auto2.allowedSpeed);



    }
}
