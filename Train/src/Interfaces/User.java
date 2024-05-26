package Interfaces;

public abstract class User implements iUser{

    protected String name; // модификатор "#" protected : значит значение поля может менять дочерний класс

    protected int age;

    protected boolean makeOrder;

    protected boolean takeOrder;

    public abstract String getName(); // добавим абстрактный метод для реализации в дочерних классах

    public abstract void setName(String name);

    public abstract int getAge(); // добавим абстрактный метод для реализации в дочерних классах

    public abstract void setAge(int age);



    
}
