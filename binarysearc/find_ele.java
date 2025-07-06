package binarysearc;

public class find_ele {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int lo = 0;
        int hi = arr.length - 1;
        int k = 5;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == k) {
                System.out.print(mid);
                return;
            } else if (arr[mid] > k) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
    }

}
