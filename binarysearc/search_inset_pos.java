package binarysearc;

public class search_inset_pos {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7 };
        int k = 6;
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] >= k) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        System.out.print(ans);
    }

}
