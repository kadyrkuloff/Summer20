package day19Loop;

public class continueStatement {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            if (i ==3){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("iiiiiiiiiiiiii");
        for (char c = 'A'; c<='F'; c++){
            if (c == 'C' || c == 'F'){
                continue;
            }
            System.out.print(c+" ");

        }

    }
}
