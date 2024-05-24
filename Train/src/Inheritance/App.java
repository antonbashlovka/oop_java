package Inheritance;

/*
 * Наследование применяется чтобы объединить общие признаки разных классов в один родительский класс
 * Таким образом сократить количество кода и придать ему иерархию 
 * В данном примере родительский класс Automobile, дочерние классы - Bus и Truck
 * Общие признаки - марка, модель; собственные признаки для Truck - 
 * 
 */

public class App {
    public static void main(String[] args){
    
        Automobile truck1 = new Automobile("daf", "123456");
        Automobile truck2 = new Truck("kamaz", "54648", 5);
        Automobile bus1 = new Bus("laz", "54648", 5);

        

    }
}
