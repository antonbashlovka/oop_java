package Model.Domain;


public class Student {

    private String name;
    private int age;

    /**
     * Конструктор класса Student 
     * @param name
     * @param age
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Геттер. Возвращает имя студента
     * @return String 
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер. Задает имя студента
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер. Возвращает возраст студента
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * Сеттер. Задает возраст студента
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    

    

}
