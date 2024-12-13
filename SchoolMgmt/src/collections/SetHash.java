package collections;

import java.util.HashSet;
import java.util.Set;

public class SetHash {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        set1.add(10);
        set1.add(11);
        set1.add(12);
        set1.add(14);
        set1.add(15);
        set2.add(12);
        set2.add(23);
        set2.add(27);
        set2.add(35);
        set2.add(33);
        System.out.println(set1.contains(13));
        System.out.println(set1.contains(set2));
        System.out.println(set1.size());
        System.out.println(set2.size());
        System.out.println(set2.isEmpty());
        System.out.println(set2.addAll(set1));
        System.out.println(set2.remove(33));
        System.out.println(set1.addAll(set2));

    }
}
