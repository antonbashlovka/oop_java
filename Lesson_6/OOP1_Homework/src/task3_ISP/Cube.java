package task3_ISP;

public class Cube implements iVolume {
    
    private int edge;
    
    public Cube(int edge) {
        this.edge = edge;
    }


    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
