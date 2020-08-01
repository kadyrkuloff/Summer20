package day34_WrapperClass;
import java.util.ArrayList;
import java.util.Arrays;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
                scores.add(95);//autoboxing;
                scores.add(100);
                scores.add(85);
                scores.add(65);
                scores.add(1,75);//1


        scores.add(5,55);
        System.out.println(scores);
        System.out.println(scores.get(2));
        System.out.println(scores.size());
    }
}
