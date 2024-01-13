package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;


public class ControllerClass {
    private ModelClass model;
    private ViewClass view;
    private List<Student> buferData = new ArrayList<>();


    public ControllerClass(ModelClass model, ViewClass view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> stud){
        if (stud.size() > 0 ){
            return true;
        }else{
            return false;
        }
        
    }

    public void update(){

        //MVC

        view.printAllStudents(model.getStudents());

        //MVP 
        buferData = model.getStudents();


    }
    

}
