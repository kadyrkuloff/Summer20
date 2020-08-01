package day10;

public class practiceIfstatements {
    public static void main(String[] args) {
        char ch = 'd';
        String abc = " ";
        boolean isAlphabetic = (ch >= 65 && ch <= 90) || (ch>=97 && ch<= 122);
        if (isAlphabetic){
            abc = ch + " is Alphabetic";
        }
        else{
            abc = ch + " is not Alphabetic";
        }
        System.out.println(abc);


        char num = '0';
        boolean isDigit = (num >= 48 && num <= 57);
        String dig = "";
        if (isDigit){
            dig = num + " is digit";
        }else{
            dig = num + " is not digit";
        }
        System.out.println(dig);

        char specSymb = '@';
        boolean isSymb = !isAlphabetic && !isDigit;
        String symb = "";
        if (isSymb){
            symb = specSymb + " is symbol";
        }else{
            symb = specSymb + " is not symbol";
        }
        System.out.println(symb);

    }
}
