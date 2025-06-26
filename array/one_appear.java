package array;

public class one_appear {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3 };
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int c = 0;

            for (int j = 0; j < arr.length; j++) {
                if (val == arr[j]) {
                    c++;
                }
            }
            if (c == 1) {
                ans = arr[i];
                break;
            }
        }
        System.out.print(ans);
    }

}
