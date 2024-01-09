//Реализовать  модель супермаркета, используя ООП

//Домашнее задание
//1) Добавить класс, описывающий акционного клиента. Включить поле название акции, id клиента и количество участников в акции(поле статическое)
//2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.
//3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.


import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;




public class App {

    
/**
 * Запускает приложение 
 * Создает экземпляры маркета и клиентов
 * Запускает клиентов в магазин методом acceptToMarket 
 * @param args входные данные
 */
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Gena");
        Actor client2 = new OrdinaryClient("Luba");
        Actor client3 = new SpecialClient("Antoha", 1);        
        Actor client4 = new ActionClient("Vasya", 1, "NewYear");
        Actor client5 = new ActionClient("Oksana", 2, "NewYear");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        magnit.update();

    }
}
