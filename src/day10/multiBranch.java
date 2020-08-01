package day10;

public class multiBranch {
    public static void main(String[] args) {
        int number = 00;
        String num = " ";
        if (number > 0){
            num = number +" is positive";
        }
        if (number <0){
            num = number + " is negative";
        }
        if (number == 0) {
            num = number + " is zero";
        }
        System.out.println(num);

        System.out.println("xxxxxxxxxxxxxxx");
        if (number >0){
            num = number +" is positive";
        }else if (number <0){
            num = number + " is negative";
        }else{
            num = " zero";
        }
        System.out.println(num);
    }
}
