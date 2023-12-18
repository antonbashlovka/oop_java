package domain;

public class Product {

    private String name;
    private int price;
    private int place;
    private String type;

    public Product(String name, int price, int place, String type){
        this.name = name;
        this.price = price;
        this.place = place;
        this.type = type;


    }


    @Override
    public String toString (){
        return "product " + "name= " + this.name + "; place= " + this.place + "; price= " + this.price + "; type= " + this.type + ";";
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public int getPlace() {
        return place;
    }


    public void setPlace(int place) {
        this.place = place;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

}

    

