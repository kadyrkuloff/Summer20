package day23Arrays;

public class maxMin {
    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 4, 5, 6, 7, -10, -100, 300, 400};
        int max = arr[0];
        for (int i = 0; i <= arr.length-1; i++){
            if(max < arr[i]){
            max = arr[i];
            }

        }
        System.out.println(max);
        int min = arr[0];
        for (int j = 0; j <= arr.length-1; j++){
            if(min > arr[j]){
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}
