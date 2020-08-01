package day27_recap;

import java.util.Arrays;
import java.util.Scanner;

public class array_practice01 {
    public static void main(String[] args) {
        String[] names = {"Aalia", "Nurbiye", "Ayse", "Nadir", "Muhtar"};
        //System.out.println(names[1]);
        for(int i=0; i<=names.length-1; i++){
           //if(names[i].charAt(0)!='A')
            if(!(names[i].startsWith("A"))){
                continue;
            }
            System.out.println(names[i]);
        }

        System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQ");
        int[] numbers = new int[5];
        numbers[3] = 25;
        numbers[0] = 100;


        System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQ");
        Scanner scan = new Scanner(System.in);
        System.out.println("how many names you want to enter");
        String[] students = new String[scan.nextInt()];
        scan.nextLine(); //to take out enter in scanner memory
        for(int i = 0; i <=students.length-1; i++){
        System.out.println("Enter a name:");
        students[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(students));












    }
}
