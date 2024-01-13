package Model;

import java.util.ArrayList;
import java.util.List;

import Model.Domain.Student;

public class ModelClass {

    private List<Student> students;
    
    public ModelClass(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents(){
        return students;
    }
    
}
