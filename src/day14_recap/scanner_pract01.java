package day14_recap;

import java.util.Scanner;
/*task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )

 */
public class scanner_pract01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your gender:");
        String gender = in.next();
        System.out.println("Enter your age:");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Enter your country name:");
        String country = in.nextLine();
        System.out.println("Enter your zip");
        int zip = in.nextInt();
        System.out.println("Enter your full name:");
        in.nextLine();
        String fullName = in.nextLine();
        System.out.println("Enter your company name:");
        String company = in.nextLine();






    }
}
