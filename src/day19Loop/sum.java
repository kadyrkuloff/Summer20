package day19Loop;

public class sum {
    public static void main(String[] args) {
        int i, sum = 0;
        for(i = 0; i <= 100; i+=2){
            sum +=i;

        }
        System.out.println(sum);
        System.out.println("llllllllllllllllllll");
        int sumE = 0;
        for (i =0; i<=100; i++){
            if(i%2==0){
                sumE += i;
            }
        }
        System.out.println(sumE);
        System.out.println("llllllllllllllllllll");
        int sumO= 0;
        for (i = 1; i <=100; i+=2){
            sumO += i;
        }
        System.out.println(sumO);
        System.out.println("llllllllllllllllllll");
        int sumO2 = 0;
        for (i = 1; i <=100; i++){
            if(i%2!=0){
                sumO2 +=i;
            }
        }
        System.out.println(sumO2);



    }
}
