import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import View.ViewClassEng;
import Model.ModelClassHash;
import Model.Domain.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Kesha", 21);
        Student student2 = new Student("Lesha", 20);
        Student student3 = new Student("Sasha", 23);
        Student student4 = new Student("Pasha", 22);
        Student student5 = new Student("Masha", 25);

        //List<Student> studlList = new ArrayList<>();
        //studlList.add(student1);
        //studlList.add(student2);
        //studlList.add(student3);
        //studlList.add(student4);
        //studlList.add(student5);

        HashMap<Integer, Student> studList = new HashMap<>();
        studList.put(0, student1);
        studList.put(1, student2);
        studList.put(2, student3);
        studList.put(3, student4);
        studList.put(4, student5);
       
        iGetModel model = new ModelClassHash(studList);
        iGetView view = new ViewClassEng();
        ControllerClass controller = new ControllerClass(model, view);

        controller.run();

        controller.update();

    }
}
