package day29CustomMethods;

public class method_practice {

    public static void main(String[] args) {
        odd0to100();
        System.out.println();
        even0to100();
    }
    public static void odd0to100(){
        for(int i = 1; i<=100; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

    public static void even0to100(){
        for(int i = 0; i<=100; i+=2){
            System.out.print(i+" ");
        }
    }















}
