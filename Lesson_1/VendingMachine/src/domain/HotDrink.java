package domain;

public class HotDrink extends Product{

    private int temperature;
    
    public HotDrink(String name, int price, int place, String type, int temperature) {
        super(name, price, place, type);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + " temperature= " + this.temperature + ";"; 
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }



    
    

    
    
}
