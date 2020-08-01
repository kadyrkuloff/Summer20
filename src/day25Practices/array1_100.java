package day25Practices;

import java.util.Arrays;

public class array1_100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
       for(int i = 0; i <numbers.length; i++ ){
           numbers[i] = i+1;
           /*if(numbers[i]%2==0){
               System.out.print(numbers[i]+ ", ");
           }*/
       }
       for(int each : numbers){
           if(each%2!=0){
               continue;
           }
           System.out.print(each + ", ");
       }















    }
}
