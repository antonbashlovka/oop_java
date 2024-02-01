package Cars;

public class Car extends Automobile{
    private int trunkVolume;

    public Car(String model, int maxSpeed, int trunkVolume) {
        super(model, maxSpeed);
        this.trunkVolume = trunkVolume;
    }

}
