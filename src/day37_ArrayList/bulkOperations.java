package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean r1 =list.contains(1);
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);


        boolean r2 = list.containsAll(elements);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("+======================================================");
        ArrayList<Integer> list02 = new ArrayList<>();
        list02.add(1);
        list02.add(2);
        list02.add(3);
        list02.add(4);
        int [] arr ={10,20,40};
        boolean r3 = list02.containsAll(Arrays.asList(arr));
        System.out.println(r3);
        System.out.println("======================================================");
        ArrayList <Integer> numbers = new ArrayList<>();
        Integer[] nums = {30,25,40,15,55,65,75,85,95,100};
        //numbers.addAll(Arrays.asList(nums));
        numbers.addAll(Arrays.asList(30,25,40,15,55,65,75,85,95,100));
        System.out.println(numbers);
        System.out.println("======================================================");
        ArrayList<String> group1 = new ArrayList<>();
        group1.addAll(Arrays.asList("Akram", "Ali", "Evgenia","Fatma", "Ferhat"));
        boolean r4 = group1.containsAll(Arrays.asList("Genc","Mijat"));
        System.out.println(r4);
        System.out.println(group1);
        System.out.println("======================================================");
        ArrayList<Integer> nums02 = new ArrayList<>();
        nums02.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));
        System.out.println(nums02);
        nums02.removeAll(Arrays.asList(1));//removes all matching elements
        System.out.println(nums02);
        ArrayList<Integer> num03 = new ArrayList<>();
        num03.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));
        System.out.println(num03);
        num03.retainAll(Arrays.asList(1,2,3,9));//removes not matching elements
        System.out.println(num03);
        System.out.println("======================================================");
        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Ahmed","Muhtar","Ahmed","Virginia", "Beslan", "Ibrahim", "Ahmed"));
        System.out.println(employee);
       // employee.removeAll(Arrays.asList("Ahmed")); //removed all Ahmed from the list
        //System.out.println(employee);
        employee.retainAll(Arrays.asList("Ahmed"));//retain all Ahmed in the list rest removed.
        System.out.println(employee);













    }
}
