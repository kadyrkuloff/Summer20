package day31_Recap;

public class method_practice02 {

    public static void main(String[] args) {
        String s = "madam";
        String s2 =reverse2(s);
        System.out.println(s.equalsIgnoreCase(s2));
    }


    public static void reverse1(String str){
        String expectedResult = "";
        for(int i = str.length()-1; i>=0; i--){
            expectedResult += str.charAt(i);
        }
        System.out.println(expectedResult);
    }


    public static String reverse2(String str){
        String expectedResult = "";
        for(int i = str.length()-1; i>=0; i--){
            expectedResult += str.charAt(i);
        }
        return expectedResult;
    }






}
