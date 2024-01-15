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

    /**
     * Конструктор класса ControllerClass
     * @param model
     * @param view
     */
    public ControllerClass(iGetModel model, iGetView view){
        this.model = model;
        this.view = view;
    }

    /**
     * Тест списка студентов - проверяет пустой ли список
     * @param stud
     * @return boolean
     */
    private boolean testData(List<Student> stud){
        return (stud.size() > 0) ? true : false;
    }
    
    /**
     * Проверяет список студентов с помощью testData() на пустоту, вызывает на печать список с помошью view.printAllStudents()
     */
    public void update(){

        this.bufferData = model.getStudents();

        if (testData(bufferData)){
            view.printAllStudents(bufferData);
        }else{
            System.out.println("Список студентов пуст");
        }



    }


    /**
     * Осуществляет диалог с пользователем - запрашивает команду. 
     * В случае команды DELETE запрашивает номер студента из списка на удаление
     * В случае если команды нет в списке - выход из программы в блоке catch
     * @throws Exception
     */
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
