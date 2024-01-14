package View;

import java.util.List;

import Model.Domain.Student;    
public class ViewClass {

    /**
     * Выводит в консоль список студентов
     * @param students
     */
    public void printAllStudents(List<Student> students){

        System.out.println("---------------------------------Список студентов----------------------------");

        for(Student s : students){
            System.out.println(s);
        }


        System.out.println("------------------------------------------");

    }
    
}
