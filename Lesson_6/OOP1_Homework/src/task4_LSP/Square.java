package task4_LSP;

public class Square implements iArea {

    private int edge;

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public int area() {
        
        return edge*edge;
    }
}