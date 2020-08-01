package day11Ternary;

public class daysInMonth02 {
    public static void main(String[] args) {
        int mon = 9;
        boolean day28 = mon == 2;
        boolean day30 = mon == 4 || mon == 6 || mon == 9 || mon == 11;
        boolean invalid = mon < 1 || mon > 12;
        boolean isValid = mon >= 1 && mon <= 12;
        String result = "";
        if (isValid){
            if (mon == 2){
                result = "28 days in choosen month";
            }else if (mon == 4 || mon == 6 || mon == 9 || mon == 11){
                result = "30 days in choosen month";
            }else{
                result = "31 days in choosen month";
            }


        }else{
            result = "invalid entry";
        }
        System.out.println(result);













    }


}
