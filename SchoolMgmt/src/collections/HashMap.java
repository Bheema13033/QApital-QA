package collections;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new java.util.HashMap<>();
        map.put(1,"akshay");
        map.put(2,"bheema");
        map.put(3,"akash");
        map.put(4,"raghu");
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.containsValue(2));
        System.out.println(map.hashCode());
    }
}
