package day29CustomMethods;

public class uniqueElements {


    public static void main(String[] args) {

        String[] arr = {"A", "B", "B", "C"};
        uniques(arr);

        String[] arr2 = {"D","D","E","F","F"};
        uniques(arr2);
    }


    public static void uniques(String[] arr){
        for(String i : arr) {

            int count = 0;
            for (String each : arr) {
                if (i.equalsIgnoreCase(each)) {
                    count++;
                }
            }
            if(count == 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }







}
