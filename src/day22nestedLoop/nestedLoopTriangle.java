package day22nestedLoop;

public class nestedLoopTriangle {
    public static void main(String[] args) {
        String tri = "";
        for (int i = 7; i >= 1; i--){
            for (int j =1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
