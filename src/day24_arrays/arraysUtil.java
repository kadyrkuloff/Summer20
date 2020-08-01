package day24_arrays;
import java.util.Arrays;
public class arraysUtil {
    public static void main(String[] args) {

        int [] arr = {1,2,3};

        //String str = Arrays.toString(arr);
        //System.out.println(str);

        System.out.println(Arrays.toString(arr));
        String names[] = {"Muhammed", "Gokhan", "Oksana", "Ashat", "Dardan" };
        System.out.println(Arrays.toString(names));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        int [] nums = {5, 4, 6,5,4,3,10};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("max number: "+ nums[nums.length-1]);
        System.out.println("min number: "+ nums[0]);

        String students[] = {"Mehdi", "Elkem", "Meee", "Trump" };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        int [] arr1 ={1,2,3};
        int [] arr2 = {3,1,2};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);

    }
}
