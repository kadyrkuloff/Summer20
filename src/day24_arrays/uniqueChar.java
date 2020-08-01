package day24_arrays;

import java.util.Scanner;

public class uniqueChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        String a = input.next();
        String unique = "";
        for (int i = 0; i <= a.length() - 1; i++){
            char ch = a.charAt(i);
            int first = a.indexOf(ch);
            int last = a.lastIndexOf(ch);
            if (first == last){
                unique += ch;
            }
        }
        System.out.println(unique);
    }
}
