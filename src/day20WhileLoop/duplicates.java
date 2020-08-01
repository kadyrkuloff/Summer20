package day20WhileLoop;

import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        //write a program that can remove the duplicates from any given String
        Scanner in = new Scanner(System.in);
        String str = in.next();//ab
        String result = "";
        for (int i= 0; i <= str.length() - 1; i++){
            String s =""+str.charAt(i);
            if(!result.contains(s)){//if char already contained in result will not add to result
                result += s;
            }


        }
        System.out.println(result);


    }
}
