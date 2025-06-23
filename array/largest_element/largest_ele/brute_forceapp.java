package largest_ele;

import java.util.*;

public class brute_forceapp {
    public static void main(String[] args) {
        // step-1 sort the array
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        // step-2 return the last element of array
        System.out.print("largest element is " + arr[arr.length - 1]);

    }// time complexity---o(nlogn)

}
