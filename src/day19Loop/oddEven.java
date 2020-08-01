package day19Loop;

public class oddEven {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i += 2) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (i = 0; i <= 100; i++){
            if (i%2 !=0){
                if (i%3==0 && i%5==0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        for (i = 0; i <=100; i +=2){
            if (i %5==0 && i %3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (i = 0; i <= 100; i++){
            if(i%2==0){//even num
                if (i %5==0 && i %3==0){//num must be / by 3 and 5
                    System.out.print(i+" ");
                }
            }
        }












    }
}