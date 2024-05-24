package Inheritance_and_polymorphizm;

/*
 * Наследование применяется чтобы объединить общие признаки разных классов в один родительский класс
 * Таким образом сократить количество кода и придать ему иерархию 
 * В данном примере родительский класс Automobile, дочерние классы - Bus и Truck
 * Общие признаки - марка, модель; собственные признаки для Truck - loadWeight, для Bus - numPassengers
 * В расширяющем классе можно переопределить родительские методы
 */

public class App {
    public static void main(String[] args){

        Automobile auto1, auto2; //Можно при создании нескольких объектов одного класса их объединить
    
        auto1 = new Automobile("Daf", "123456");
        auto2 = new Truck("Kamaz", "54648", 5);

        Automobile auto3 = new Bus("Laz", "54648", 35); // Создание объекта наследника с типом родителя
        Bus auto4 = new Bus("Neoplan", "4df5tg45", 75); // Создание объекта наследника со своим типом

        auto1.printDescription(); // Метод прописан в базовом классе Automobile 
        auto2.printDescription(); // Метод переопределен в расширяющем классе Truck и выводит уже данные объекта Truck
        auto3.printDescription(); // Метод переопределен в расширяющем классе Bus и выводит уже данные объекта Bus

        //System.out.println(auto3.getNumPassengers()); Из родительского посмотреть свойства наследников мы не можем
        System.out.println("\n"+auto4.getNumPassengers()); //Мы их можем из наследника и посмотреть
        System.out.println("\n"+auto4.getMake()); //Мы можем из наследника открыть публичные и защищенные методы родителя, приватные не можем
        
       
    }
}

