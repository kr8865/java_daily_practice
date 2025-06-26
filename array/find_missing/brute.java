package array.find_missing;

public class brute {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans = i + 1;
                break;
            }
        }
        System.out.print(ans);

    }

}
