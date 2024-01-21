/*
 * Написать код в соответствии с Single Responsibility Principle
 */

package task1_SRP;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;
    

    /**
     * Конструктор для Емплойи 
     * @param name - имя 
     * @param dob - дата рождения 
     * @param baseSalary - базовая ставка
     */
    public Employee(String name, Date dob, int baseSalary) {

        Accounting account = new Accounting(baseSalary);

        this.name = name;
        this.dob = dob;
        this.baseSalary = account.calculateNetSalary();
    }
    

    /**
     * Получить инфо о работнике
     * @return строка с информацией
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString() + " , salary - " + baseSalary;
    }
    
}

