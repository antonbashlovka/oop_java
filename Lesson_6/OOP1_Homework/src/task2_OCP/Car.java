package task2_OCP;

public class Car extends Vehicle{

    /**
     * Конструктор Car 
     * @param maxSpeed - принимает int скорость
     * @param type - принимает String type
     */
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        super.val = 0.8;
    }

    
}
