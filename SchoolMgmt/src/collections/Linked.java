package collections;

import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        List<Integer> list1=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);
        list1.add(30);
        list1.add(33);
        list1.add(35);
        list1.add(44);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.addAll(list1));
        System.out.println(list.contains(25));
        System.out.println(list.remove(3));
        System.out.println(list1.size());
    }
}
