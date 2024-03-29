package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel{
    private List<Student> students;

    /**
     * Конструктор класса ModelClass
     * @param students
     */
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    /**
     * Геттер. Возвращает List студентов
     * @return List
     */
    public List<Student> getStudents (){
        return this.students;
    }

    
}
