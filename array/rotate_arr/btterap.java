package array.rotate_arr;

public class btterap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
    // time complexity-o(n) and space-o(1)
}
