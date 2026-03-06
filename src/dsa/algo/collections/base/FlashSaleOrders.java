package dsa.algo.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class FlashSaleOrders {
    static void main(String[] args) {
        Collection<Integer> orderIds=new ArrayList<>();
        orderIds.add(101);
        orderIds.add(102);
        orderIds.add(103);
        System.out.println("Orders recieved"+orderIds);
        System.out.println("No of orders:"+orderIds.size());
    }
}
