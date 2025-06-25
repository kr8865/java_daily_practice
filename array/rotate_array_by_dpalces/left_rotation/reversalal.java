package array.rotate_array_by_dpalces.left_rotation;

public class reversalal {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        int n = arr.length;
        reversedd(0, k - 1, arr);
        reversedd(k, n - 1, arr);
        reversedd(0, n - 1, arr);
        for (int f = 0; f < n; f++) {
            System.out.print(arr[f] + " ");
        }
    }

    public static void reversedd(int i, int j, int[] arr) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}
