package day19Loop;

public class finra {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i ++){
            String r = (i %3== 0 && i % 5 == 0)? "finra":(i %3== 0)? "fin":(i %5== 0)?"ra":""+i;
            System.out.print(r+" ");
        }


    }
}
