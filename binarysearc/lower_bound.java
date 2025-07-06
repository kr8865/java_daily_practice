package binarysearc;

public class lower_bound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6 };
        int k = 3;
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == k) {
                ans = mid;
            } else if (arr[mid] < k) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }

        }
        System.out.print(ans);
    }

}
