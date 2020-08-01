package day08;

public class gal2Lit{
        public static void main(String[] args) {
       /* 1. write a java program that converts gallons to liters
        1 gallon = 3.785 liters
        1 litter = 1/3.785
        2. write a java program that converts litters to gallons
        1 gallon = 3.785 liters
        1 litter = 1/3.785
        */
            double gallon = 5;
            double litter = 5;
            double litToGal = litter / 3.785;
            double galToLit = litter * 3.785;
            System.out.println(litToGal+" gallons in " + litter + " litter.");
            System.out.println(galToLit + " litter in " + gallon + " gallon." );
            System.out.println("><><><<><><<><><><><><><><><><><><><><><><><><><<>><><><><><><><<><><><");
        /*  3. manually calculate the following code fragements:
        1. int a = 200;
        int b = -a++ + - --a * a-- % 2
        b = ?
         */
            int a = 200;
            int b = -a++ + - --a * a-- % 2; //-200 + - 200*200&2 - since demainder of 200 % 2 would be 0 then we * -199 = 0 result of equasion -200
            System.out.println(b);
            System.out.println("))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
        /*2. int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y; */

            int x = 300;
            int y = 400;
            int z = x + y - x * y + x / y; // 300 + 400 - ((1st)300 * 400 = 120000) + ((2)300 / 400 = 0.75) = 119299.25 but since it was called as int 0.75 was not included into
            System.out.println(z);

        }


}
