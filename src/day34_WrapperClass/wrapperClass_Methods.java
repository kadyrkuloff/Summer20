package day34_WrapperClass;

public class wrapperClass_Methods {

    public static void main(String[] args) {
        String str = "123";
        int f = Integer.parseInt(str);
        System.out.println(f+5);

        Double a = Double.parseDouble("7.5");

        System.out.println(a+2.5);

        String s1 = "TRUE";
        boolean b1 = Boolean.parseBoolean(s1);// not case sensitive.
        System.out.println(b1);

        System.out.println("=============================================================================");

        String str2 = "10000.5";
        Double d = Double.valueOf(str2);
        System.out.println(d+0.5);

        String str3 = "FaLsE";
        boolean r2 =  Boolean.valueOf(str3);//unboxing not case sensitive
        System.out.println(r2);



    }
















}
