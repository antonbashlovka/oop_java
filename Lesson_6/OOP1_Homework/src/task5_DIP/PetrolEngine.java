package task5_DIP;

public class PetrolEngine implements EngineType{ 
    
    @Override
    public void start() {
        System.out.println(this.type() + " " + "started");
    }

    @Override
    public String type() {
        return "petrol engine";
    }
    
}
