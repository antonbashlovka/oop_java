package task5_DIP;

public class Auto {
    private PetrolEngine engine;

    public Auto(PetrolEngine engine) {
        this.engine = engine;
    }
    
    public void start() {
        this.engine.start();
    }
}
