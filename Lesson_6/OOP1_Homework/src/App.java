/*
 * Домашняя по SOLID
 * 
 */

import task1_SRP.*;
import task2_OCP.*;
import task3_ISP.*; 
import task4_LSP.*;
import task5_DIP.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        // task 1 - srp - принцип единой ответственности (каждый решает свою задачу)
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse("22-01-2000");
        Employee worker = new Employee("Serj", date, 20000);
        System.out.println(worker.getEmpInfo());
        System.out.println("--------------------------------------------");

        // task 2 - ocp - принцип открытости/закрытости - класс должен быть открыт для расширения но закрыт для изменения
        Vehicle vehicle = new Car(80, "Bus");
        SpeedCalculation speed = new SpeedCalculation();
        System.out.println(speed.calculateAllowedSpeed(vehicle));
        System.out.println("--------------------------------------------");

        // task 3 - isp - принцип разделения интерфейсов
        Circle circle = new Circle(10);
        Cube cube = new Cube(5);
        System.out.println(circle.area());
        System.out.println(cube.volume());
        System.out.println("--------------------------------------------");

        //task 4 - lsp - принцип подстановки Лисков
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(2);
        rectangle.setWidth(4);
        System.out.println(rectangle.area());

        Square square = new Square();
        square.setEdge(3);
        System.out.println(square.area());
        System.out.println("--------------------------------------------");

        //task 5 - dip - принцип инверсии зависимости
        PetrolEngine pe = new PetrolEngine();
        Auto auto = new Auto(pe);
        auto.start();


    }

    
}
