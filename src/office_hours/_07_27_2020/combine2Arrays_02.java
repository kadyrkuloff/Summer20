package office_hours._07_27_2020;

import java.util.Arrays;

public class combine2Arrays_02 {
    public static void main(String[] args) {
        char[] a1 = {'A', 'B', 'C', 'D'};
        char[] a2 = {'D', 'E', 'F'};
        char[] a3 = new char[a1.length + a2.length];
        int i = 0;
        for (int j = 0; j <= a1.length - 1; j++) {
            a3[i] = a1[j];
            i++;
        }
        for (int e = 0; e <= a2.length - 1; e++) {
            a3[i] = a2[e];
            i++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
