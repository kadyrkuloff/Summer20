package day36_ArrayList;

import java.util.ArrayList;

public class arrayList_methods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int a =list.indexOf(40);
        System.out.println(a);
        System.out.println(list.lastIndexOf(40));
        boolean r1 = list.contains(100);
        System.out.println(r1);
        System.out.println("============================================");
        ArrayList<String> list03 = new ArrayList<>();
        list03.add("Cybertek");
        ArrayList<String> list04 = new ArrayList<>();
        list04.add("Cybertek");
        System.out.println(list03);
        System.out.println(list04);
        System.out.println(list03.equals(list04));




    }

}
