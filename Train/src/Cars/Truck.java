package Cars;

public class Truck extends Automobile{
    private String bodyType;

    public Truck(String model, int maxSpeed, String bodyType) {
        super(model, maxSpeed);
        this.bodyType = bodyType;
    }
    
}
