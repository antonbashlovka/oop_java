package Inheritance;

public class Bus extends Automobile{

    private int numPassengers;

    public Bus(String make, String model, int numPassengers) {
        super(make, model);
        this.numPassengers = numPassengers;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    
    
}
