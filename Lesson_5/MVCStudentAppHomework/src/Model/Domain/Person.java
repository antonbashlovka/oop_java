package Model.Domain;

public class Person {
    protected String name;
    protected int age;

    /**
     * Конструктор класса Person 
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Геттер. Возвращает имя персонажа
     * @return String
     */
    public String getName() {
        return name;
    }


    /**
     * Сеттер. Задает имя персонажа
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер. Возвращает возраст персонажа
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * Сеттер. Задает возраст персонажа
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person" + " name: " + this.name + ", age: " + this.age;
    }
    
}