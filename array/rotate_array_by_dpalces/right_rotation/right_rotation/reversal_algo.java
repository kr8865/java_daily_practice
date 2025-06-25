package array.rotate_array_by_dpalces.right_rotation.right_rotation;

public class reversal_algo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        int n = arr.length;
        k = k % n;
        reversed(0, n - 1, arr);
        reversed(0, k - 1, arr);
        reversed(k, n - 1, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reversed(int i, int j, int[] arr) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
