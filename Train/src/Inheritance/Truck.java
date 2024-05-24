package Inheritance;

public class Truck extends Automobile{
    
    private int loadWeight;

    public Truck(String make, String model, int loadWeight) {
        super(make, model);
        this.loadWeight = loadWeight;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    

}
