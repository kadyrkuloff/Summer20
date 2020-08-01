package day24_arrays;

public class average {
    public static void main(String[] args) {
        /*
        Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10
         */
        int[] arr = {4, 5, 6, 7, 8, 15, 20, 30, 0, 100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        double average = sum/(double)arr.length;
        System.out.println(average);
    }
}
