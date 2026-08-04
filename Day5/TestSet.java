package Day5;

import java.lang.classfile.constantpool.IntegerEntry;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        //Higher Type always accept Lower Type
        Set<Integer> set = new HashSet<Integer>();

        //Hashset - elements in random order, retrieval faster
        //add() - to insert elements 
        set.add(15);
        set.add(25);
        set.add(35);
        set.add(45);
        set.add(55);
        System.out.print("First hash set : ");
        System.out.println(set);

        //remove() - removes the element from set
        set.remove(35);
        System.out.println("After Removing 35 HashSet is : ");
        System.out.println(set);

        //Hashset doesn't allow duplicates
        set.add(15);
        set.add(25);
        System.out.println(set);


        //LinkedHashset maintains elements in insertion order
        Set<Integer> set2 = new LinkedHashSet<Integer>();

        //add()
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.print("Linked Hash Set : ");
        System.out.println(set2);

        //remove()
        set2.remove(4);
        System.out.println(set2);

        //Treeset keeps elements in sorted order
        Set<Integer> set3 = new TreeSet<Integer>();

        set3.add(34);
        set3.add(21);
        set3.add(13);
        set3.add(67);

        System.out.println("TreeSet : " + set3);


    }
}

 