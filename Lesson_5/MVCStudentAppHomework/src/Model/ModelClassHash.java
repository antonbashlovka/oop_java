package Model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel{
    private List<Student> listStudents;
    private HashMap<Integer, Student> hashStudents;

    /**
     * Конструктор класса ModelClass
     * @param hashStudents
     */
    public ModelClassHash(HashMap<Integer, Student> hashStudents) {
        this.listStudents = new ArrayList<>();
        Collection<Student> collection = hashStudents.values();

        for (Student st : collection){
            this.listStudents.add(st);
        }

    }

    /**
     * Геттер. Возвращает List студентов
     * @return List
     */
    public List<Student> getStudents (){
        return this.listStudents;
    }

    
}