package collections;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer>list1=new ArrayList<>();

        list1.add(20);
        list1.add(30);
        list1.add(35);
        list1.add(33);
        list.addAll(list1);
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(12);

        System.out.println(list);
       list.remove(5);

       // list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(12));
        System.out.println(list.iterator());
        list.clear();
        System.out.println(list);

;    }
}
