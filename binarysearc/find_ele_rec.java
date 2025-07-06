package binarysearc;

public class find_ele_rec {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int c = binary_rec(arr, 0, arr.length - 1, 5);
        System.out.print(c);

    }

    public static int binary_rec(int[] arr, int i, int j, int k) {
        int mid = (i + j) / 2;
        if (i == j) {
            return -1;
        }
        if (arr[mid] == k) {
            return mid;
        }

        if (arr[mid] > k) {
            return binary_rec(arr, i, mid - 1, k);
        } else {
            return binary_rec(arr, mid + 1, j, k);
        }

    }

}
