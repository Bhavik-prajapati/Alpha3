package Hashmap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Set;

public class Hashmaps {
    public static void main(String[] args) {

        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("india",100);
        hm.put("china",200);
        hm.put("spain",300);
        hm.put("germany",400);
//        System.out.println(hm);
//        System.out.println(hm.get("india"));
//        System.out.println(hm.containsKey("india"));
//        System.out.println(hm.containsKey("aus"));
        Set<String> keys=hm.keySet();
//        System.out.println(keys);

        for(String k:keys){
            System.out.print(k+" "+hm.get(k)+" ");
            System.out.println();
        }






    }
}
