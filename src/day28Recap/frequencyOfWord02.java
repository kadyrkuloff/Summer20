package day28Recap;

import java.util.Scanner;

import java.util.Scanner;

public class frequencyOfWord02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       String str = in.next();
       String word = in.next();
       int count = 0;
       int dcount = 0;
       for(int i =0; i <= str.length()-word.length(); i++){

           if(str.substring(i,i+word.length()).equalsIgnoreCase(word)){
               count++;
           }
         //  if(str.substring(i,i+3).equalsIgnoreCase("dog")){
           //    dcount++;
           //}

       }
        System.out.println(count);
       // System.out.println(dcount);














    }
}
