package Inheritance_and_polymorphizm;

public class Truck extends Automobile{
    
    private int loadWeight;

    public Truck(String make, String model, int loadWeight) {
        super(make, model);
        this.setLoadWeight(loadWeight);
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public void printDescription(){
        super.printDescription();
        System.out.println("This automobile can be loaded for " + loadWeight + " tons.");
    }

}
