package task2_OCP;

public class Vehicle {
    int maxSpeed;
    String type;
    double val;
    

    /**
     * Конструктор Vehicle 
     * @param maxSpeed - принимает int скорость
     * @param type - принимает String type
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    
    /**
     * Получить максимальную скорость 
     * @return int скорость
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    /**
     * Получить тип
     * @return String тип
     */
    public String getType() {
        return this.type;
    }

    /**
     * Получить val - коэффициент на который умножить макс.скорость
     * @return String тип
     */
    public double getVal() {
        return this.val;
    }





}