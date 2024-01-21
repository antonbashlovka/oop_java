/*
 * Написать код в соответствии с Single Responsibility Principle
 */


package task1_SRP;

public class Accounting {
    private int baseSalary;

    
    /**
     * @param baseSalary принимает int базовая ставка
     */
    public Accounting(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    /**
     * Непостредственно расчет зп
     * @return числом насчисения минус налоги
     */
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
    
}
