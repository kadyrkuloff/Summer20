package office_hours.practice_07_20_2020;

public class max_3DArray {
    public static void main(String[] args) {
        int [][][] arr3D= { {{1,2},{3,4}}, {{5,6,7},{8,9,888,10}}};
        int max = arr3D[0][0][0];
        for (int[][]each2D : arr3D) {
            for (int[]each1D:each2D) {
                for(int each:each1D){
                    if(each>max){
                        max=each;
                    }
                }
            }
        }
        System.out.println(max);













    }
}
