package day22nestedLoop;

public class whileNestedLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            for (int j= 1; j<=5; j++){
                System.out.print("*");

            }
            System.out.println();
            i++;
        }
    }
}
