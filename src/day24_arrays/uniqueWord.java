package day24_arrays;

import java.util.Arrays;

public class uniqueWord {
    public static void main(String[] args) {
        String[] words = {"Java", "C#", "C#", "Python", "Python", "C++"};
        for(int j = 0; j<words.length; j++) {
            String s = words[j];
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                String each = words[i];
                if (s.equals(each)) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println(s);
            }
        }













    }
}
