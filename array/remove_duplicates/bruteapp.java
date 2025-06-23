package array.remove_duplicates;

public class bruteapp {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 3, 3, 4 };
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                int j = i;
                while (j < n - 1) {
                    arr[j] = arr[j + 1];
                    j++;

                }
                i--;
                n--;
            }

        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k] + " ");
        }
        System.out.println(n);
    }

}
