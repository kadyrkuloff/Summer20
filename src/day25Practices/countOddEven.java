package day25Practices;

public class countOddEven {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int countOdd = 0;
        int countEven = 0;
        for(int each : nums){
            if(each%2 == 0){
                countEven += 1;
            }else{
                countOdd +=1;
            }
        }
        System.out.println("Even Numbers: "+ countEven);
        System.out.println("Odd Numbers: "+ countOdd);












    }
}
