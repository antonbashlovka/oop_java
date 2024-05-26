package Interfaces;

public class Client extends User{


    public String makeOrder(String managerName){
        return "Hello, manager " + managerName + "! Take my order please.";
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
