package office_hours.july07_2020;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String  reverse = "";
        for (int i = str.length()-1; i >=0; i--){

            reverse +=str.charAt(i);
        }

        System.out.println(reverse);
        String j = "";
        int a = str.length()-1;
        while(a>=0){
            j +=str.charAt(a);
            a--;
        }
        System.out.println(j);




    }
}
