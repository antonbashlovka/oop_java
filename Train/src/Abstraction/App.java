package Abstraction;

public class App {
    /*
     * Абстрактным называется такой класс, экземпляр которого нельзя создать сам по себе – он служит основой для других классов. 
     * 
     * Абстрактные классы непосредственно предназначены для того, чтобы их расширяли другие классы, 
     * которые затем могут реализовывать абстрактные методы и наследовать неабстрактные члены и поведение абстрактного класса.
     * 
     * Абстрактным называется такой метод, который объявляется, но не предоставляет реализации.
     * в абстрактных методах нет тела, но они могут содержать возвращаемый тип, 
     * параметры и модификаторы. 
     * Ответственность за реализацию абстрактного метода ложится на конкретные субклассы, расширяющие абстрактный класс.
     * https://habr.com/ru/companies/piter/articles/738508/
     * 
     * Пользуйтесь абстрактными классами, чтобы моделировать иерархии взаимосвязанных классов: 
     * при помощи абстрактных классов очень удобно представить группу таких взаимосвязанных классов, 
     * которые совместно используют некий общий функционал. Создавая абстрактный класс, который определяет общие методы и свойства, 
     * вы тем самым избегаете дублирования, повышаете модульность вашего кода и облегчаете его поддержку. 
     * 
     * Пользуйтесь абстрактными методами, чтобы определять общее поведение: 
     * абстрактные методы полезны в тех случаях, когда требуется навязать конкретное поведение сразу для множества субклассов. 
     * Определяя абстрактный метод в абстрактном классе, вы можете гарантировать, что все субклассы (каждый по-своему) будут реализовывать одно и то же поведение.
     * 
     * Правило такое: пользуйтесь абстрактными классами, когда хотите предоставить базовую реализацию для группы взаимосвязанных классов. 
     * Интерфейсы уместнее, когда нужно определить группу методов для реализации разрозненными классами, в каждом по-своему.
     */

    public static void main(String[] args){

        Dog sharik = new Dog("dog", "white", 4, false, true);
        Cow marta = new Cow("cow", "red", 4, 3, 1);

        sharik.describe();
        marta.describe();


        

    }
    
}
