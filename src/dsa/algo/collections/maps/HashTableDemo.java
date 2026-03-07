package dsa.algo.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(106,"Sharanya");
        ht.put(117,"Shreyas");
        ht.put(128,"Sonika");
        ht.put(100,"Siri");
        ht.put(99,"Sunil");
        ht.put(101,"Prashant");
        for (Map.Entry<Integer,String> entry: ht.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        ht.remove(98);
        System.out.println(ht);

    }
}
