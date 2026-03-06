package dsa.algo.collections.sets;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
public static void printList(List<?>list){
 for(Object o:list) {
     System.out.println(o+" ");

 }
    System.out.println();
}

    static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        printList(strings);
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        printList(integers);
    }
}
