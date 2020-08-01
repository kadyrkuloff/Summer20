package day24_arrays;

import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter?");
        int n = input.nextInt();

        int [] arr = new int [n];
        for (int i = 0; i< n; i++){
            System.out.println("Enter number");
            int num = input.nextInt();
            arr[i] = num;
        }
        int max = arr[0];
        int min = arr[0];
        for(int j = 0; j < n; j++){
            if(arr[j] > max){
                max = arr[j];
            }
            if (arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
