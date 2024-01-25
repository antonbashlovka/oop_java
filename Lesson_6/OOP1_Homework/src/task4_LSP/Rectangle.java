package task4_LSP;

public class Rectangle implements iArea{
    private int width;
    private int height;

    /**
     * Принимает и сохраняет ширину прямоугольника
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * Принимает и сохраняет высоту прямоугольника
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}
