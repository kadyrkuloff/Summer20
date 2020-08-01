package day33_LocalDateTime;

public class uniques {


    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3,4,5,4,6,8};
        uniqueElements(arr);
        double [] arrD = {2.3,3.4,1.2,2.3,3.4,4.7,5.8,4.9,6.8,8.8};
        uniqueElements(arrD);
        String[] arrS = {"A","B","C","A","B"};
        uniqueElements(arrS);
        char[] arrC = {'c','b','c','b','a'};
        uniqueElements(arrC);
    }

    public static void uniqueElements(int[] arr){
        for(int element : arr) {
            int count = 0;

            for (int each : arr) {

                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements(double[] arr){
        for(double element : arr) {
            int count = 0;

            for (double each : arr) {

                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements(String[] arr){
        for(String element : arr) {
            int count = 0;

            for (String each : arr) {

                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements(char[] arr){
        for(char element : arr) {
            int count = 0;

            for (char each : arr) {

                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }













}
