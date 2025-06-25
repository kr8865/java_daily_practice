package array.rotate_array_by_dpalces.right_rotation.right_rotation;

public class brutefrc {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        int n = arr.length;
        int j = 0;
        int[] temp = new int[n];

        for (int i = n - k; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n - k; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
            System.out.print(arr[i] + " ");
        }
    }
}
