package Abstraction;

public class Cow extends Animal{

    /**
     * В расширяющем классе мы делаем уже конкретную а не абстрактную сущность
     * со своими полями и методами, а общие для всех абстрактные методы переопределяем как нам надо
     */
    private int milkAmount;

    private int hornLength;

    /**
     * В расширяющем классе необходимо создать конструктор 
     * который будет вызывать конструктор абстрактного класса через super
     * @param kind
     * @param color
     * @param numLegs
     */
    public Cow(String kind, String color, int numLegs, int milkAmount, int hornLength) {
        super(kind, color, numLegs);
        this.setHornLength(hornLength);
        this.setMilk(milkAmount);
    }

    @Override
    public String eat() {
        return "hay";
    }
    
    @Override
    public String say() {
        return "moo-o-o!";
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("Now I'm going to give " + this.milkAmount + " liters of milk; my horns are " + this.hornLength + " meters. I eat "+ eat() +" and I say you " + say()); 
    }

    public int getMilk() {
        return this.milkAmount;
    }

    public void setMilk(int milkAmount) {
        this.milkAmount = milkAmount;
    }

    public int getHornLength() {
        return this.hornLength;
    }

    public void setHornLength(int hornLength) {
        this.hornLength = hornLength;
    }
        
}
