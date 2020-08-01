package day26MultiDimentionalArray;

import java.util.Arrays;

public class Java_python {
    public static void main(String[] args) {
        /*
        write a program that can return the number of appearances of “java”
        and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python
         */
        String sentence = "I love Java, Python is cool, java java, python." ;
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int countJava = 0;
        int countPython = 0;
        for(String each: words){
            if(each.toLowerCase().contains("java")){
                countJava++;

            }
            if(each.toLowerCase().contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava + " Java");
        System.out.println(countPython + " Python");


























    }
}
