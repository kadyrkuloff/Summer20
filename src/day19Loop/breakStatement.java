package day19Loop;


public class breakStatement {
    public static void main(String[] args) {
       for (int i =0; i <5; i++){
           System.out.println("Hello");
            break;
       }
        System.out.println("Liverpool");
       for (char ch = 'A'; ch <= 'H'; ch++){
           System.out.print(ch+" ");//A B C
           if(ch=='C'){
               break;
           }
           //System.out.print(ch+" "); only will give A B
       }
        System.out.println();
        System.out.println("Champion");
        for(int i = 10; i <= 50; i+=10){
            System.out.print(i+" ");//10 20 30
            if(i == 30){
                break;
            }
            //System.out.print(i+" ");//10 20
        }
        System.out.println();
        System.out.println("of England");
        for(int x = 1000; x >=100; x-=100){
            //System.out.println(x+" "); 1000 900 800 700 600 500
            if(x==500){
                break;
            }
            System.out.print(x +" ");//1000 900 800 700 600
        }






    }
}
