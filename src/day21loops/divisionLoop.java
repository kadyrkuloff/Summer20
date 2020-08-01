package day21loops;

import java.util.Scanner;

public class divisionLoop {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;
        int count = 0;

        while(a >=b){//condition of loop where "a" equal or greater then "b" if false loop stops
            a-=b;
            count++;//add 1 everytime loop get executed
        }
        System.out.println(count+ " with a remainder of "+a);









    }
}
