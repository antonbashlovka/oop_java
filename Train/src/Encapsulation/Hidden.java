package Encapsulation;

/*
 * Это скрытая от пользователя часть программы - 
 * для примера будем складывать два числа и выдавать результат
 * 
 * 
 */

public class Hidden {
    
    private int a; // скрываем доступ к полям из других классов приложения с помощью модификатора private
    private int b; // скрываем доступ к полям из других классов приложения с помощью модификатора private

    /**
     * Конструктор для класса Hidden - присваивает значения полям
     * Конкретно здесь получается что конструктор и не нужен, значения можно задать сеттерами
     * @param a 
     * @param b
     */
    /*public Hidden(int a, int b) {
        this.a = a;
        this.b = b;
    }*/

    /**
     * Метод для вычисления суммы
     * @return int sum a+b
     */
    public int getSum(){
        return a+b;
    }

    /**
     * Геттер a
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     * Сеттер а
     * @param a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Геттер b
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     * Сеттер b
     * @param b
     */
    public void setB(int b) {
        this.b = b;
    }
    
    @Override
    public String toString() {
        return "a="+this.a+";b="+this.b+";" ;
    }


}
