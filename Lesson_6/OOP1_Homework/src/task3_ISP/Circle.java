package task3_ISP;

public class Circle implements iArea {
    private double radius;

    /**
     * Конструктор Circle принимает и сохраняет радиус круга
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

}
