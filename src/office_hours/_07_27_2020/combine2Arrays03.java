package office_hours._07_27_2020;

import java.util.Arrays;

public class combine2Arrays03 {
    public static void main(String[] args) {

        String[] a1 = {"Tatiana", "Hamit", "Pho"};
        String[] a2 = {"Aaloa", "Zaki", "Cristina", "Dawut"};
        String[] students =new String[a1.length+a2.length];

        for(int i =0; i<=a1.length-1;i++){
            students[i] = a1[i];
        }
        for(int i = 0; i<=a2.length-1; i++){
            students[i+a1.length]=a2[i];
        }
        System.out.println(Arrays.toString(students));














    }
}
