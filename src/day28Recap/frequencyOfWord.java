package day28Recap;

public class frequencyOfWord {
    public static void main(String[] args) {
        /*
        write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3


         */
    String str = "javajavajavajavajava";
    int count = 0;
    for(int i = 0; i<=str.length()-4; i++){
        String s = str.substring(i, i+4);
        if(s.equalsIgnoreCase("java")){
            count++;
        }
    }
        System.out.println(count);
















    }

}
