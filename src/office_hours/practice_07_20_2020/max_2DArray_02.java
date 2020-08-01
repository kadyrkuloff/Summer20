package office_hours.practice_07_20_2020;

public class max_2DArray_02 {
    public static void main(String[] args) {
        int [][] arr2D = { {1,2,3} , {4,5,6,7} ,{100,300,888}, {500},{8,9,10,11,12} , {13,14,15,20,16,17}};

        int max = arr2D[0][0];

        for(int[] each1D: arr2D){
            for (int each : each1D){
                if(each>max){
                    max=each;
                }
            }
        }
        System.out.println(max);
















    }
}
