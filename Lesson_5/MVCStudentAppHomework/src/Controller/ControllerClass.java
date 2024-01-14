package Controller;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;

import java.util.ArrayList;

import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;

    private List<Student> bufferData = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view){
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


    public void run()
    {
        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                   getNewIter = false;
                   System.out.println("Выход из программы");
                   break;
                case LIST:
                   view.printAllStudents(model.getStudents());
                   break;
            }
        }
    }

}
