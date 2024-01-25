package task4_LSP;

public class Square implements iArea {

    private int edge;

    /**
     * Принимает и сохраняет сторону квадрата
     * @param edge
     */
    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public int area() {
        return edge*edge;
    }
}