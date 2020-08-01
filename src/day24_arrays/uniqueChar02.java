package day24_arrays;

import java.util.Scanner;

public class uniqueChar02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        String ExpectedResult = "";
        for(int j = 0; j<str.length(); j++) {
            char ch1 = str.charAt(j);


            int count = 0;//frequency of char
            for (int i = 0; i <= str.length() - 1; i++) {//finding of frequency of char and assign int
                char each = str.charAt(i);
                if (ch1 == each) {
                    count++;
                }
            }
            if (count == 1) {
                ExpectedResult += ch1;
            }

        }
        System.out.println(ExpectedResult);








    }
}
