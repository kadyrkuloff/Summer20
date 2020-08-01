package day36_ArrayList;

import java.util.ArrayList;

public class uniques {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> uniques = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(8);
        ArrayList<Integer> uniques = new ArrayList<>();
        for(Integer each : list) {
            Integer element = each;
            int count = 0;
            for(Integer i : list){
                if(i==element){
                    count++;
                }
            }
            if(count ==1){
                uniques.add(element);
            }
        }
        System.out.println(uniques);


    }

}
