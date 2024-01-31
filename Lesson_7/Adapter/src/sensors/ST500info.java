package sensors;

import java.time.LocalDateTime;

import interfaces.iSensorTemperature;

public class ST500info implements iSensorTemperature{

    @Override
    public int identifier() {
        return 100;
    }

    @Override
    public double temperature() {
        return 20.0;
    }

    @Override
    public int year() {
        return LocalDateTime.now().getYear();
    }

    @Override
    public int day() {
        return LocalDateTime.now().getDayOfYear();
    }

    @Override
    public int second() {
        LocalDateTime now = LocalDateTime.now();
        return now.getHour() * 3600 + now.getMinute() * 60 + now.getSecond();
    }
    
}
