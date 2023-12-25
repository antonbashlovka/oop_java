package Classes;

import Interfaces.iActorBehavior;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehavior, iReturnOrder{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;


    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();

    abstract void setName(String str);

}
