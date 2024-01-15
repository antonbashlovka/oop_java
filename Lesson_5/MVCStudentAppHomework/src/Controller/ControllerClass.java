package Controller;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;

import java.util.ArrayList;

import Model.Domain.Student;


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


    public void run() throws Exception 
    {
        
        Command com = (Command)Command.NONE;
        boolean getNewIter = true;

        while(getNewIter)
        {
            this.bufferData = model.getStudents();
            String command = view.prompt("Введите команду:");
            String prevCommand = "";
            try {
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
                        case DELETE:
                            prevCommand = command;
                            command = view.prompt("Введите номер студента от 0 до " + (this.bufferData.size()-1));
                            
                        break;
                        default: 
                            getNewIter = false;
                            System.out.println("Выход из программы");
                        break;
                    }

                    if (prevCommand.equals("DELETE")){
                        try {
                            Double.parseDouble(command);

                            getNewIter = false;

                            this.bufferData.remove(Integer.parseInt(command));

                        } catch (NumberFormatException e) {
                            getNewIter = false;
                            System.out.println("Выход из программы");
                        }

                    }
                }

            catch (Exception e) {
                getNewIter = false;
                System.out.println("Выход из программы");
            }
            
        }
    }
}
