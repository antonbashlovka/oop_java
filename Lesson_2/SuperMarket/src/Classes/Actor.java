package Classes;

import Interfaces.iActorBehavior;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehavior, iReturnOrder{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;

    /**
     * Конструктор клиента
     * создает экземпляр клиента
     * @param name имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстракный метод получения имени клиента
     * @return имя клиента
     */
    abstract String getName();


    /**
     * Абстракный метод задает имя клиента
     * @param str имя 
     */
    abstract void setName(String str);

}
