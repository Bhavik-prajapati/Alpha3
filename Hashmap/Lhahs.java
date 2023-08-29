package Hashmap;

import javax.lang.model.type.IntersectionType;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Lhahs {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("a",10);
        lhm.put("b",20);
        lhm.put("c",30);
        lhm.put("d",40);

        System.out.println(lhm);
        HashMap<String , Integer> l=new HashMap<>();
        l.put("a",10);
        l.put("b",20);
        l.put("c",30);
        l.put("d",40);
        System.out.println(l);

    }
}
