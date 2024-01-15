package Model;

import java.util.HashMap;

import Controller.Interfaces.iGetModelHash;
import Model.Domain.Student;

public class ModelClassHash implements iGetModelHash{
    private HashMap<Integer, Student> students;

    /**
     * Конструктор класса ModelClass
     * @param students
     */
    public ModelClassHash(HashMap<Integer, Student> students) {
        this.students = students;
    }

    /**
     * Геттер. Возвращает List студентов
     * @return List
     */
    public HashMap<Integer, Student> getStudents (){
        return this.students;
    }

    
}