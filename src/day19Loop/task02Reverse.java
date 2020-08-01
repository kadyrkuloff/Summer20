package day19Loop;

import java.util.Scanner;

public class task02Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str =in.next();
        //String result ="" + str.charAt(str.length()-1) + str.charAt(3) + str.charAt(2) + str.charAt(1)+ str.charAt(0);
        String result ="";
        for (int i =str.length()-1 ; i >= 0; i--){
            result +=str.charAt(i);
        }

        System.out.println(result);

    }
}
