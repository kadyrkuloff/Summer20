package day36_ArrayList;

import java.util.ArrayList;

public class Set_Method {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.set(list.size()-1,0);
        System.out.println(list);

        System.out.println("=============================================");

        ArrayList<Integer> list02 = new ArrayList<>();
        for(int i =1; i<=20;i++){
            list02.add(i);
        }

        System.out.println(list02);

        for (int i = 0;i<=list02.size()-1;i++){
            Integer each = list02.get(i);
            if (each%2!=0){
                list02.set(i,each*2);
            }else{
                list02.set(i,each*3);
            }

        }
        System.out.println(list02);




    }
}
