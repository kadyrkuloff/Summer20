package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class uniqueChar {
    public static void main(String[] args) {
        String a = "ABCDBD";
        ArrayList<String> arrl = new ArrayList<>();
        for(int i = 0; i <a.length(); i++){
            arrl.add(""+a.charAt(i));
        }
        System.out.println(arrl);
        ArrayList<String>uniques = new ArrayList<>();
        for(String each:arrl){
            int count = Collections.frequency(arrl,each);
            if(Collections.frequency(arrl,each)==1){
                uniques.add(each);
            }

        }
        System.out.println(uniques);









    }

}
