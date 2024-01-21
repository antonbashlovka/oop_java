package task2_OCP;

public class Bus extends Vehicle{

    /**
     * Конструктор Bus 
     * @param maxSpeed - принимает int скорость
     * @param type - принимает String type
     */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
        super.val = 0.6;
    }
    
}
