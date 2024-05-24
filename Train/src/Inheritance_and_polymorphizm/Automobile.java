package Inheritance_and_polymorphizm;

public class Automobile { 
    
    /*!!! Этот пример только для показа наследования, в жизни
        для общего, примерного описания сущностей использовать АБСТРАКТНЫЙ класс !!!
    */

    private String make;

    private String model; // Поля мы всегда защищаем приватом, чтобы никто не менял их значения напрямую

    /**
     * Конструктор принимает 
     * @param make
     * @param model
     */
    public Automobile(String make, String model) {
        this.setMake(make);
        this.setModel(model);
    }

    protected String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printDescription(){
        System.out.println("\nAutomobile is " + "make " + this.make
            + " model " + this.model + ". ");
    }
    
}
