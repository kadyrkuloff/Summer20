package day29CustomMethods;

import java.util.Scanner;

public class methodWithParameter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        printHello(5);
        age(in.nextInt(), in.nextInt());
    }

    public static void printHello(int n){

        for(int i = 0; i<n; i++){
            System.out.println("Hello World");
        }
    }

    public static void age(int birthYear, int currentYear){
        if(currentYear<birthYear){
            System.out.println("Invalid Entry");
        }else {
            int age = currentYear - birthYear;
            System.out.println("you are " + age + " years old");
        }
    }
















}
