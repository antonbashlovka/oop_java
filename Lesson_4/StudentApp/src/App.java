import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controller.AccountController;
import Domain.PersonComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }


        Teacher teacher1 = new Teacher("Alex", 20, "Docent");
        Teacher teacher2 = new Teacher("Evgeniy", 25, "Docent");

        System.out.println(new PersonComparator<Teacher>().compare(teacher1, teacher2));
        System.out.println(new PersonComparator<Student>().compare(s1, s2));

        new AccountController().paySalary(teacher1, 50000);

        //new AccountController().paySalary(s1, 50000);


    }


}
