package task2_OCP;

public class SpeedCalculation {

    
    /**
     * Расчет допустимой скорости
     * @param vehicle - принимает экземпляр Vehicle
     * @return double MaxSpeed
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {

        return vehicle.getVal() * vehicle.getMaxSpeed();
    }
}



