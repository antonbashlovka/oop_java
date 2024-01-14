package Controller;

import java.util.List;
import java.util.ArrayList;

import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

public class ControllerClass {

    private ModelClass model;
    private ViewClass view;

    private List<Student> bufferData = new ArrayList<>();

    public ControllerClass(ModelClass model, ViewClass view){
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> stud){
        return (stud.size() > 0) ? true : false;
    }
    
    public void update(){

        this.bufferData = model.getStudents();

        if (testData(bufferData)){
            view.printAllStudents(bufferData);
        }else{
            System.out.println("Список студентов пуст");
        }



    }

}
