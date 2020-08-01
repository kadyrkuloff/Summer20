package day24_arrays;

public class for_each {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3,4,5,6,7,8,9,-1, -2, -3};
        for (int i=0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)");

        for (int each : arr){//each represents the elements
            System.out.print(each +" ");
        }
        System.out.println();
        System.out.println("(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)(,)");

        String[] arr1 ={"Diliara", "Finn", "Meder", "Muslima", "Madjit" };
        for (String each : arr1){
            System.out.print(each +" ");
        }
        System.out.println();
    }
}
