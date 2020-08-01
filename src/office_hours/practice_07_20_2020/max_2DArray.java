package office_hours.practice_07_20_2020;

public class max_2DArray {
    public static void main(String[] args) {
        /*
         write a program that can find the maximum number from any given two dimensional array
        solution one: use nested for loops
        solution two: use nested for each loops
        solution three: use for loop and for each loop together
         */
        int [][] arr2D = { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} , {13,14,15,20,16,17}};
        int max = arr2D[0][0];
        for(int i = 0; i<=arr2D.length-1;i++){

            int[] eachArr = arr2D[i];

            for(int j=0; j<=eachArr.length-1;j++){
                int eachNum = eachArr[j];

                if(eachNum > max){
                    max = eachNum;
                }

            }

        }
        System.out.println(max);
        System.out.println("task2task2task2task2task2task2task2task2task2task2task2task2task2task2");


















    }
}
