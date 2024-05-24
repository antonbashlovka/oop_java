package Abstraction;

public abstract class Animal {

    /**
     * Абстрактный класс может содержать поля
     */
    private String kind; 

    /**
     * Абстрактный класс может содержать поля
     */
    private String color; 

    /**
     * Абстрактный класс может содержать поля
     */
    private int numLegs;

    /**
     * Абстрактный класс может содержать конструктор
     * @param kind
     * @param color
     * @param numLegs
     */
    public Animal(String kind, String color, int numLegs) {
        this.kind = kind;
        this.color = color;
        this.numLegs = numLegs;
    }

    /**
     * Абстрактный класс может содержать абстрактные методы, 
     * они общие для наследников, не имеют тела и 
     * предназначены для переопределения в классах-наследниках
     */
    public abstract String eat();

    public abstract String say();

    public void describe(){
        System.out.println("\nHello, I'm a " + this.color + " " + this.kind + " and I have " + this.numLegs + " legs.");
    }


    /**
     * Абстрактный класс может содержать обычные методы с реализацией
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    
}
