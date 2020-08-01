package day29CustomMethods;

public class methodWithoutParameter02 {
    public static void main(String[] args) {
        printHello5x();
        System.out.println("cybertek");
        printHello5x();
        System.out.println("Ertur");
        printHello5x();
        odd0to100();
        System.out.println();
        even0to100();
    }


   public static void printHello5x(){
       for(int i = 0; i<=4 ;i++ ){
           System.out.println("Hello World");
       }

   }

   public static void odd0to100(){
        for(int i = 1; i<=100; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
   }

    public static void even0to100(){
        for(int i = 1; i<=100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }






}
