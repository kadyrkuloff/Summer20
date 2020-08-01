package day31_Recap;
import library.Util;
public class frequencyOfChar {
    public static void main(String[] args) {
        String str = "AABBBCCC";
        String expectedResult = "";
        String nonDup = Util.removeDup(str);
        for(char each : nonDup.toCharArray()) {

            int count = Util.frequency(str, each);
            expectedResult += ""+ each+count;
        }
        System.out.println(expectedResult);
    }


}
