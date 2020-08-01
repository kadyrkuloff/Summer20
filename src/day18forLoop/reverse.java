package day18forLoop;

public class reverse {
    /*
    String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
     */
    public static void main(String[] args) {
        String str = "Python";
        String s1 = str.substring(1); //ava
        String s2 = str.substring(0,1);//J
        String result1 = s1 + s2;
        System.out.println(result1);


    }
}
