package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;


public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> buferData = new ArrayList<>();


    public ControllerClass(iGetModel model, iGetView view) {
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
