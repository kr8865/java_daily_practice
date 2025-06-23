package second_largest_ele;

import java.util.*;

public class brute_force {
    public static void main(String[] args) {
        // step-1 sort the array
        int[] arr = { 1, 2, 3, 4, 5 };
        Arrays.sort(arr);
        System.out.print("the second largest element " + arr[arr.length - 2] + " ");
        System.out.println();
        System.out.print("the second higesht element " + arr[1]);

    }

}
