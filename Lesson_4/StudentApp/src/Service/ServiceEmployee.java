package Service;

import java.util.List;
import java.util.ArrayList;

import Domain.Employee;
import Domain.PersonComparator;


public class ServiceEmployee implements iGenericInterface<Employee>{
    private int count;
    private List<Employee> employees;

    public ServiceEmployee(){
        this.employees = new ArrayList<>();
    }

    
    public void sortBySecondName(){
        PersonComparator <Employee> perComp = new PersonComparator<>();
        this.employees.sort(perComp);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        employees.add(new Employee(name, age, "Basic"));
        count++;
    }


}
