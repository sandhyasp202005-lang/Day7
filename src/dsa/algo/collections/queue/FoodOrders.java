package dsa.algo.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    static void main(String[] args) {
        Queue<String> orders=new LinkedList<>();
        //For adding-add() [Fail][Strict],offer() [Not Fail][Not Strict]
        orders.add("Order101");     //Strict Capacity based
        orders.offer("Order102");       //Flexible
        System.out.println("Orders:"+orders);
        //For removal:remove()->Strict[Fail] poll() Not Strict[NotFail]
        System.out.println("Serving: "+orders.poll());
        System.out.println("Pending over: "+orders);
        System.out.println(orders.element());
    }
}
