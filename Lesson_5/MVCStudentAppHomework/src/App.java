import java.util.List;
import java.util.ArrayList;


import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import View.ViewClass;
import View.ViewClassEng;
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

        
        //Без интерфейсов
        //ModelClass model = new ModelClass(studlList);
        //ViewClass view = new ViewClass();
        //ControllerClass controller = new ControllerClass(model, view);
        //controller.update();

        //с интерфейсами
        iGetModel model = new ModelClass(studlList);
        iGetView view = new ViewClassEng();
        ControllerClass controller = new ControllerClass(model, view);
        //controller.update();

        controller.run();

        controller.update();

    }
}
