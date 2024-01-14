import java.util.List;
import java.util.ArrayList;


import Controller.ControllerClass;
import View.ViewClass;
import Model.ModelClass;
import Model.Domain.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Kesha", 21);
        Student student2 = new Student("Lesha", 20);
        Student student3 = new Student("Sasha", 23);
        Student student4 = new Student("Pasha", 22);
        Student student5 = new Student("Masha", 25);

        List<Student> studlList = new ArrayList<>();
        
        studlList.add(student1);
        studlList.add(student2);
        studlList.add(student3);
        studlList.add(student4);
        studlList.add(student5);

        ModelClass model = new ModelClass(studlList);
        ViewClass view = new ViewClass();
        ControllerClass controller = new ControllerClass(model, view);
        
        controller.update();





    }
}
