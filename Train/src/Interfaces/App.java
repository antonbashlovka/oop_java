package Interfaces;

/*
 * Тема интерфейсов в продолжении темы абстрактных классов
 * 
 * Повторяем, абстрактный класс - это заготовка (общий чертеж), которая содержит ОПИСАНИЕ, потом расширяется и превращается в реальные сущности
 * При наследовании от абстрактного класса используется ключевое слово extends (с англ. «расширяет»), а при реализации интерфейса — implements (с англ. «реализует»). 
 * 
 * Интерфейс описывает ПОВЕДЕНИЕ, которым должны обладать классы, реализующие этот интерфейс.
 * Особенности интерфейсов:
 *  - класс может одновременно реализовывать несколько интерфейсов
 *  - класс, связанный с каким-то интерфейсом, должен реализовать все его методы
 *  - для интерфейсов не существует понятия «конструктор» 
 *  - все переменные в интерфейсах неявно public static final (т.е. константы). «final» подразумевает, что переменной должно быть присвоено значение во время инициализации
 *  - в случае с интерфейсами модификаторы доступа могут быть только двух типов, public и private (последний — начиная с Java 9 и только при наличии тела)
 *  - интерфейс не может реализовывать интерфейс, не может наследовать абстрактный класс, но может наследовать (используя ключевое слово extends) множество других интерфейсов
 * 
 *  В общем если вы хотите заставить какой-то класс использовать определенные методы, сделайте чтобы этот класс имплементировал интерфейс
 */


public class App {
    public static void main(String[] args){

    }
    
}
