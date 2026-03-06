package dsa.algo.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class liveOrders {
    static void main(String[] args) {
        Collection<String> liveOrders=new ArrayList<>();
        //new orders are added
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        //Check order
        System.out.println("ORD103 esists?"+liveOrders.contains("ORD103"));     //gives true or false
        //Check the live orders
        //LiveOrders.remove("ORD102");this will remove a particular order
        System.out.println("Live Orders:"+liveOrders);
        liveOrders.clear();
        System.out.println("Orders after Closing"+liveOrders);

    }
}
