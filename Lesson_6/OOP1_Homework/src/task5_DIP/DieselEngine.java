package task5_DIP;

public class DieselEngine implements EngineType
{
    @Override
    public void start() {
        System.out.println(this.type() + " " + "started");
    }

    @Override
    public String type() {
        return "diesel engine";
    }
    
}
