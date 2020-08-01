package office_hours.practice_07_28_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class palindromeTest {

    public static void main(String[] args) {
        isPalindrome("Madam");
        String [] names = {"Aslan", "Ramazan", "Alex", "Erfan", "Aalia", "Ayhan"};
        String[] reverse = new String[names.length];
        int k = 0;
        for(int i = names.length-1; i>=0; i--){
            reverse[k] = names[i];
            k++;
        }
        System.out.println(Arrays.toString(reverse));
        ArrayList<String> nameList = new ArrayList<>();
        for(String each : names){

        }
    }


    public static void isPalindrome(String a){
        String reverse = "";
        for(int i = a.length()-1; i>=0; i--){
            reverse += a.charAt(i);
        }
        /*if(reverse.equalsIgnoreCase(a)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/
        boolean palindrome = a.equalsIgnoreCase(reverse);
        System.out.println(palindrome);
    }



}
