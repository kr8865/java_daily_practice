package array.find_missing;

public class better {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int N = 5;
        int sum = (N * (N + 1)) / 2;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            c += arr[i];
        }
        System.out.print(sum - c);

    }

}
