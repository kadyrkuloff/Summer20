package day23Arrays;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        String[] day = new String[7];

        day[6]= "Sunday";
        day[1]= "Tuesday";
        day[4]= "Friday";
        day[3]= "Thursday";
        day[2]= "Wednesday";
        day[5]= "Saturday";
        day[0]= "Monday";
        for (int i = 0; i<=day.length-1; i++){
            System.out.print(day[i]+ " ");
        }
        System.out.println();


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number between 1-7");
        int n = scan.nextInt();
        System.out.println(day[n-1]);





    }
}
