package Classes;

public class ActionClient extends Actor{

    public static int actionAmount = 0;
    public int idActionClent;
    public String action;

    
    public ActionClient(String name, int idActionClent, String action) {
        super(name);
        this.idActionClent = idActionClent;
        this.action = action;
        this.actionAmount++;
        System.out.println("количество участников акции " + actionAmount);

    }


    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    void setName(String str) {
        super.name = str;
    }

    
}
