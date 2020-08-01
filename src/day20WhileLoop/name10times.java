package day20WhileLoop;

public class name10times {
    public static void main(String[] args) {
        String name = "Ertur";
        int num = 10;
        while (num <= 20){
            System.out.print(name+" ");
            num++;
        }
        System.out.println();
        int num1 = name.length()-1;
        String jopa = "";
        while(num1 >=0){
            char ch = name.charAt(num1);
            num1 --;
            jopa +=ch;
        }
        System.out.println(jopa);


    }
}
