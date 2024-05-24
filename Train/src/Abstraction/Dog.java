package Abstraction;

public class Dog extends Animal{

    /**
     * В расширяющем классе мы делаем уже конкретную а не абстрактную сущность
     * со своими полями и методами, а общие для всех абстрактные методы переопределяем как нам надо
     */
    private boolean protection;

    private boolean attack;

    /**
     * В расширяющем классе необходимо создать конструктор 
     * который будет вызывать конструктор абстрактного класса через super
     * @param kind
     * @param color
     * @param numLegs
     */
    public Dog(String kind, String color, int numLegs, boolean attack, boolean protection) {
        super(kind, color, numLegs); //сохраняем общие свойства
        setAttack(attack); //докидываем свои
        setProtection(protection);
    }


    @Override // обязательно переопределяем т.к он есть в родительском абстрактном классе
    public String eat() {
        return "meat";
    }

    @Override // обязательно переопределяем т.к он есть в родительском абстрактном классе
    public String say() {
        return "gaff!";
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("Now I'm going to protect: " + this.protection + "; to attack: " + this.attack + ". I eat "+ eat() +" and I say you " + say()); 
    }

    /**
     * Добавляем свои методы по необходимости
     * @return
     */
    public boolean isProtection() {
        return this.protection;
    }

    public void setProtection(boolean protection) {
        this.protection = protection;
    }

    public boolean isAttack() {
        return this.attack;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }
    
}
