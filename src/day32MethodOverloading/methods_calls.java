package day32MethodOverloading;

import library.Util;

import java.util.Arrays;

public class methods_calls {
    public static void main(String[] args) {
        String first = "eLkEm";
        String last = "EMeT";
        String fullname = Util.formatFullName(first, last);
        System.out.println(fullname);
        String uniques = Util.uniques(fullname.toLowerCase());
        System.out.println(uniques);
        String reversedName = Util.reverse(fullname);
        System.out.println(reversedName);
        System.out.println("++++++++++++++++++++++++++++++++++");
        int [] a ={200,400,500,200,1000,50,40,30,400,60,78};
        int n = 2500;
        a = Util.addElement(a,n);
        System.out.println(Arrays.toString(a));











    }
}
