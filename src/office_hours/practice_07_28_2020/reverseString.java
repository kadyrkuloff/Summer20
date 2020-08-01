package office_hours.practice_07_28_2020;

public class reverseString {


    public static void main(String[] args) {
        String str = "Jopa";
        String revRes =reverse(str);
        System.out.println(revRes);
    }

    public static String reverse(String a){
        String result = "";

        for(int i = a.length()-1; i>=0; i-- ){

            result += ""+a.charAt(i);
        }



        return result;

    }



}
