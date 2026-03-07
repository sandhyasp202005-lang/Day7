package dsa.algo.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    static void main(String[] args) {
        Map<String,String> users=new HashMap<>();
        users.put("admin","admin@123");
        users.put("user1","pass1");
        users.put("user2","pass2");
        users.put("admin","admin@456"); //Update the pass
        System.out.println("Admin Password:"+users.get("admin"));
    }
}
