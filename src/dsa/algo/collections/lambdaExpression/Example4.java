package dsa.algo.collections.lambdaExpression;

import java.util.ArrayList;
//Java StreamAPI - Java8    (::)-> stream(->) lambda
public class Example4 {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
       list.forEach(n->System.out.println(n));      //STREAM API Java 8
        list.forEach(n-> System.out.println(n));        //lambda
    }
}
