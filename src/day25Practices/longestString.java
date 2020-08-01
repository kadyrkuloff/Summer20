package day25Practices;

public class longestString {
    public static void main(String[] args) {
        String [] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abi", "Ali", "Joe","Kotokbash"};
        int maxLength = arr[0].length();
        for(String each:arr){
            int l = each.length();
            if(maxLength<l){
                maxLength = l;
            }
        }
        for(String each:arr) {

            if(maxLength == each.length()){
                System.out.println(each);
            }
        }












    }
}
