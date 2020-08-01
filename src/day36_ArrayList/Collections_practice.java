package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = list.size()-1;i>=0; i--){
            result.add(list.get(i));

        }
        System.out.println(result);
        System.out.println("++==========================================");
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("A");
        list02.add("B");
        list02.add("C");
        list02.add("D");
        list02.add("E");
        System.out.println(list02);
        Collections.swap(list02,1,2);//{A,C,B,D,E}
        System.out.println(list02);
        Collections.swap(list02,0,list02.size()-1);//{E,C,B,D,A}
        System.out.println(list02);

        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('A');
        charList.add('C');
        charList.add('C');
        int count = Collections.frequency(charList,'C');
        System.out.println(count);





    }
}
