package View;

import java.util.List;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView{

    public void printAllStudents(List<Student> students){
        System.out.println("-------------------------------------------------------список студентов-------------------------------------------------------------");
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}