package task5_DIP;

public class Auto {
    private EngineType engine;

    /**
     * Конструктор авто - Принимает и сохраняет тип двигателя
     * @param engine
     */
    public Auto(EngineType engine) {
        this.engine = engine;
    }
    
    public void start() {
        this.engine.start();
    }
}
