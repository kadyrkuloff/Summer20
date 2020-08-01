package day30_custom_method;

public class returnMethods02 {


    public static void main(String[] args) {
        String a = "kayak";
       // revStr1(a);
        //System.out.println(a.equalsIgnoreCase(revStr1(a)));
        String reversedName = revStr2(a);
        System.out.println(reversedName.equalsIgnoreCase(a));
    }



    public static void revStr1(String str){
        String result = "";
        for(int i =str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    public static String revStr2(String str){
        String result = "";
        for(int i =str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }

}
