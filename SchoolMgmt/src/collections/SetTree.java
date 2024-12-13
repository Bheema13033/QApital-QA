package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTree {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> treeset1 =new TreeSet<>();

        treeSet.add(11);
        treeSet.add(13);
        treeSet.add(15);
        treeSet.add(19);
        treeSet.add(20);
        treeSet.add(11);
        treeset1.add(11);
        treeset1.add(14);
        treeset1.add(16);
        treeset1.add(19);
      /*  System.out.println(treeSet.addAll(treeset1));
        System.out.println(treeset1.size());
        System.out.println(treeset1.remove(15));
        System.out.println(treeset1.contains(55));
        System.out.println(treeSet.isEmpty());
       // Set<Integer> treeSet2 = new TreeSet<>();*/
        Set<Integer> set=new HashSet<>();
        set.add(18);
        set.add(19);
        set.add(20);
        set.add(21);
        set.add(20);
        System.out.println(set.size());
        System.out.println(set.contains(treeSet));
        System.out.println(treeSet.addAll(set));
        System.out.println(set.iterator());
        System.out.println(set.hashCode());


    }
}
