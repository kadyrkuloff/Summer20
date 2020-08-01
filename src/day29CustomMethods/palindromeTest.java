package day29CustomMethods;

public class palindromeTest {

    public static void main(String[] args) {
        palindrome("Kayak");
    }

    public static void palindrome(String str){
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result +=str.charAt(i);
        }
        if (result.equalsIgnoreCase(str)){
            System.out.println("its palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
























}
