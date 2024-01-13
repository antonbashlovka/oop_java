import java.util.List;
import java.util.ArrayList;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;


public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Kesha", 25);
        Student student3 = new Student("Jenya", 28);
        Student student4 = new Student("Aram", 23);

        List<Student> studList = new ArrayList<>();

        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);


        iGetModel model = new ModelClass(studList);
        iGetView view = new ViewClass();

        ControllerClass controller = new ControllerClass(model, view);

        controller.update();

    }
}
