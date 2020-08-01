package day24_arrays;

import java.util.Arrays;

public class String_method {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";
        char [] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        String str1 = "DCEBA";
        String str2 = "ABCDE";
        char[ ] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r = Arrays.equals(ch1, ch2);
        System.out.println(r);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        String sentence = "I love programming language";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = words.length -1; i >=0; i--){
            System.out.print(words[i]+" ");
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        String s = "JAVA";
        String [] arr = s.split(""); // J,A,V,A - every single elements string
        System.out.println(Arrays.toString(arr));
        char[] c = s.toCharArray();//every single elements char
        System.out.println(Arrays.toString(c));





    }
}
