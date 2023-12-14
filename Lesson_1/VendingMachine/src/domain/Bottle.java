package domain;

public class Bottle extends Product {
    
   
    private double volume;
    
    public Bottle(String name, int price, int place, String type, double volume) {
        super(name, price, place, type);
        this.volume = volume;
       
    }

    @Override
    public String toString (){
        return super.toString() + this.volume + ";"; 
    }

    

    
}
