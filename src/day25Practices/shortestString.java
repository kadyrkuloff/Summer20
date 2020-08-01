package day25Practices;

public class shortestString {
    public static void main(String[] args) {
        String [] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abi", "Ali", "Joe"};
        int minLenght = arr[0].length();

        for(int i = 0; i <= arr.length -1; i++ ) {
            int l = arr[i].length();
            if (minLenght > l) {
                minLenght = l;
            }

        }
        System.out.println(minLenght);
        for(int i = 0; i <= arr.length -1; i++ ) {
            if (arr[i].length() == minLenght){
                System.out.println(arr[i]);
            }
        }
    }
}
