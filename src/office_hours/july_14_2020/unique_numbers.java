package office_hours.july_14_2020;

public class unique_numbers {
    public static void main(String[] args) {
        int [] arr1 = {1,1,2,3,3,7};
        for(int n : arr1) {
            int num = n;
            int count = 0;
            for (int each : arr1) {
                if (num == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(num);
            }
        }











    }
}
