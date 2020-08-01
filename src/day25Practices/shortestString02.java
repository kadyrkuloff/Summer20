package day25Practices;

public class shortestString02 {
    public static void main(String[] args) {

        String [] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abi", "Ali", "Joe"};
        int minLenght = arr[0].length();

        for(String each : arr) {
            int l = each.length();
            if (minLenght > l) {
                minLenght = l;
            }
        }
        System.out.println(minLenght);
        for(String each : arr) {
            if (each.length() == minLenght){
                System.out.println(each);
            }
        }
    }
}
