package prak3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        MySynchronizedSet<Integer> set = new MySynchronizedSet<>(new HashSet<>());
        MySyncronizedList<Integer> list = new MySyncronizedList<>(new ArrayList<>());

        set.add(123);
        set.add(123);
        set.add(1234);

        list.add(123);
        list.add(123);
        list.add(1234);

        System.out.println("Set:");
        for (Integer i : set) {
            System.out.println(i);
        }

        System.out.println("List:");
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
