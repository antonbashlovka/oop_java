package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehavior;
import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehavior;

public class Market implements iMarketBehavior, iQueueBehavior{

    private List<Actor> queue;

    public Market(List<Actor> queue) {
        this.queue = new ArrayList<Actor>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor); //клиент пришел в магазин
        System.out.println(actor.getName() + " клиент пришел в магазин ");
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor); //клиент добавлен в очередь
        System.out.println(actor.getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void takeOrder() {
        for (Actor actor : queue){
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true); //клиент сделал заказ
                System.out.println(actor.getName() + " клиент сделал заказ ");

            }
        }
    }

    @Override
    public void giveOrder() {
        for(Actor actor : queue){
            if (actor.isTakeOrder()){
                actor.setTakeOrder(true); //клиент получил заказ 
                System.out.println(actor.getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(Actor actor : queue){
            if (actor.isTakeOrder()){
                releaseActors.add(actor); //клиент ушел из очереди


                System.out.println(actor.getName() + " клиент ушел из очереди ");

                
            }
        }
        releaseFromMarket(releaseActors); //клиент пошел на выход из магазина
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

        
    }

    @Override
    public void update(){
        takeOrder();
        giveOrder();
        releaseFromQueue();

    }

    
}
