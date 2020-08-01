package day24_arrays;

public class uniqueNum {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4};
        String expectedResult = "";
        for (int i = 0; i <= arr.length-1; i++) {
            int num1 = arr[i];

            int count = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                int frequency = arr[j];
                if (num1 == frequency) {
                    count++;
                }
            }
            if (count == 1){
                expectedResult += num1+" ";
            }
        }
        System.out.println(expectedResult);










    }
}
