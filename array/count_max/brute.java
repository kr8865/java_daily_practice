package array.count_max;

public class brute {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 1, 1 };
        int max = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++;
                max = Math.max(max, c);
            } else {
                c = 0;
            }
        }
        System.out.print(max);
    }

}
