/*
 * Домашняя по SOLID
 * 
 */

import task1_SRP.*;
import task2_OCP.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {


        // task 1 - srp
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse("22-01-2000");
        Employee worker = new Employee("Serj", date, 20000);
        System.out.println(worker.getEmpInfo());

        //task 2 - ocp
        Vehicle vehicle = new Vehicle(80, "Bus");
        SpeedCalculation speed = new SpeedCalculation();
        System.out.println(speed.calculateAllowedSpeed(vehicle));
        
    }
}
