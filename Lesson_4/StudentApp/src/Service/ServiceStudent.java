package Service;

import java.util.List;
import java.util.ArrayList;

import Domain.PersonComparator;
import Domain.Student;

public class ServiceStudent implements iGenericInterface<Student>{
    private int count;
    private List<Student> students;

    public ServiceStudent(){
        this.students = new ArrayList<>();
    }

    public void sortBySecondName(){
        PersonComparator <Student> perComp = new PersonComparator<>();
        this.students.sort(perComp);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        students.add(new Student(name, age));
        count++;
    }


}
