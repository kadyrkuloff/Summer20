package day11Ternary;

public class numToWord {
    public static void main(String[] args) {
        int n = 99;
        String n2w = " ";
        if (n == 0){
            n2w = "zero";
        }else if (n==1){
            n2w = "one";
        }else if (n==2){
            n2w = "two";
        }else if (n==3){
            n2w = "three";
        }else if (n==4){
            n2w = "four";
        }else if (n==5){
            n2w = "five";
        }else if (n==6){
            n2w = "six";
        }else if (n==7){
            n2w = "seven";
        }else if (n==8){
            n2w = "eight";
        }else if (n==9){
            n2w = "nine";
        }else{
            n2w = "Invalid Number";
        }
        System.out.println(n2w);
    }
}
