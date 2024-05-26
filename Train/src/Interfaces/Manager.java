package Interfaces;

public class Manager extends User {

    public String takeOrder(String clientName){
        return "Hello, client " + clientName + "! I'm taking your order.";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    
}
