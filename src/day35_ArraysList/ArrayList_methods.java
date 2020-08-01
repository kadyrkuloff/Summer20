package day35_ArraysList;

import java.util.ArrayList;

public class ArrayList_methods {
    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Aalia");
        earlyBirdList.set(2,"Aslan");
        earlyBirdList.set(0,"Aihan");
        earlyBirdList.remove(4);
        earlyBirdList.clear();
        System.out.println(earlyBirdList);
        System.out.println(earlyBirdList.size());
        System.out.println("================================");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);
        list.remove(3);

        System.out.println(list);
        System.out.println("==========================================");
        //remove(Element)
        ArrayList<Integer> list02 = new ArrayList<>();
        list02.add(1);
        list02.add(2);
        list02.add(3);
        list02.add(4);
        list02.add(5);
        Integer a=1;
        list02.remove(a);
        System.out.println(list02);

        ArrayList<String> list03 = new ArrayList<>();
        list03.add("Liliia");
        list03.add("Hamid");
        list03.add("Bulnet");
        list03.add("Viorel");
        list03.add("Musa");
        list03.remove("Bulnet");
        System.out.println(list03);








    }
}
