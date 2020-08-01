package day36_ArrayList;

import java.util.ArrayList;

import java.util.Collections;

public class collections_utility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(35);
        list.add(88);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));
    }
}
