package day16_string;

public class practice03 {
    public static void main(String[] args) {
        /*write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself
        Write a program  for CheckWords:*/
        /*
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
*/
        String w1 = "";
        /*if(w1.length() == 0){
            System.out.println("empty string");
        } else if(w1.length() > 3){
            System.out.println(w1.substring(w1.length()-3));
        }else{
            System.out.println(w1);
        }*/
        String r1 = (w1.length() == 0)? "empty string" : (w1.length() > 3)? w1.substring(w1.length()-3) : w1;
        System.out.println(r1);
        String a1 = "abc";
        String a2 = "abc";
        String a3 = "abc";
        boolean allSame = a1.length() == a2.length() && a1.length() == a3.length();
        boolean allDif = a1.length() != a2.length() && a1.length() != a3.length()&& a2.length() != a3.length();
        if (allSame){
            System.out.println("all string have same length");
        }else if (allDif){
            System.out.println("all different length");
        }else{
            System.out.println("not same nor different lengths");
        }



    }
}
