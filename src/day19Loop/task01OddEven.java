package day19Loop;

public class task01OddEven {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++){
            //if(i%2==0) skip even
            if(i%2!=0){//skip odd
                continue;
            }
            System.out.println(i);
        }




    }



}
