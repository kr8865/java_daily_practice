package largest_ele;

public class better_approach {
    public static void main(String[] args) {
        // step-1 initialize a variable name max store the minimum value in it
        // or you can consider the first value of array as max value
        int arr[] = { 1, 2, 3, 4, 5 };
        int max = arr[0];
        // traverse the array and compare it with max and update the variable
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max);

    }

}
