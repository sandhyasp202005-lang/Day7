package dsa.algo.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    static void main(String[] args) {
        Deque<String> actions=new ArrayDeque<>();
        actions.addLast("User Types A");
        actions.addLast("User Types B");
        actions.addLast("User Types C");
        System.out.println("UNdo:"+actions.removeLast());
        System.out.println("Remaining actions"+ actions);
    }
}
