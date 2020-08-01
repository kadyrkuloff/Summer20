package day29CustomMethods;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        maxNum(numbers);
        minNum(numbers);
    }

    public static void maxNum(int[] arr){
        int max = arr[0];
        for (int each: arr){
            if(each>max){
                max = each;
            }
        }
        System.out.println("Max: " + max);
    }

    public static void minNum(int[] arr){
        int min = arr[0];
        for (int each: arr){
            if(each<min){
                min = each;
            }
        }
        System.out.println("Min: " + min);
    }














}
