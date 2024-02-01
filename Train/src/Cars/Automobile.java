package Cars;

public class Automobile {

    private String model;
    private int maxSpeed;
    public int allowedSpeed;

    public Automobile(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.allowedSpeed = maxSpeed-20;

    }

    
    
}