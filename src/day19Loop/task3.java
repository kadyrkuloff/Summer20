package day19Loop;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String revStr = "";
        for (int i = str.length()-1;i >=0; i--){
            revStr +=str.charAt(i);
        }

        System.out.println(revStr);
        System.out.println(str.equals(revStr));



    }
}
