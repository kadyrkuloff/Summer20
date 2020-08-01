package day35_ArraysList;

import java.util.ArrayList;

public class reversedOrder {

    public static void main(String[] args) {
        /*
        write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1

         */
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }



}
