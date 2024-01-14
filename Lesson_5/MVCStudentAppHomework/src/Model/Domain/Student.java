package Model.Domain;


public class Student extends Person{

    private int id;

    private static int generalId;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }
    
    @Override 
    public String toString(){
        return super.toString() + ", id: " + this.id;
    }

    

    

}
