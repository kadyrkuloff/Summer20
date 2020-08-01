package day17;

import java.util.Scanner;

public class warmUp01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("print two words");
        String a = in.next();
        String b = in.next();
        boolean c = a.charAt(a.length() - 1) == b.charAt(0);
        if (c){
            System.out.println(a + b.substring(1));
        }else{
            System.out.println(a+b);
        }
        System.out.println("///////////////////////////////////////////////////////");





    }
}
