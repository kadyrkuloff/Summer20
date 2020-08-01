package day20WhileLoop;

public class branchingStatements {
    public static void main(String[] args) {
        char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                continue;//skips everything even iterator
            }
            System.out.println(ch);
            ch++;
        }
    }
}
