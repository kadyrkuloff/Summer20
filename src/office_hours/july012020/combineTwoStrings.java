package office_hours.july012020;

import java.util.Scanner;

public class combineTwoStrings {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

         */
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        /*char ch1 = str1.charAt(str1.length() - 1);
        char ch2 = str2.charAt(0);
        if (ch1 == ch2){
            System.out.println(str1 + str2.substring(1));//

        }else{
            System.out.println(str1+str2);
        }
        String s1 = str1.substring(str1.length() -1, str1.length()); // last string of str1
        String s2 = str2.substring(0,1);
        if (s1.equals(s2)){
            System.out.println(str1 + str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }*/






    }
}
