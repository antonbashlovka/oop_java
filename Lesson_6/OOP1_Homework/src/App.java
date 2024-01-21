/*
 * Домашняя по SOLID
 * 
 */

import task1_SRP.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {


        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse("22-01-2000");

        Employee worker = new Employee("Serj", date, 20000);

        System.out.println(worker.getEmpInfo());
        
    }
}
