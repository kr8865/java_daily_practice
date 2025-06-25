package array;

public class find_union {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 5, 5 };
        int[] arr2 = { 4, 5, 6, 7, 7, 8 };

        int n = arr1.length;
        int m = arr2.length;
        int[] newarr = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr1[i] > arr2[j] && newarr[k - 1] != arr2[j]) {
                newarr[k] = arr2[j];
                j++;
                k++;
            } else if (arr1[i] < arr2[j] && newarr[k - 1] != arr1[i]) {
                newarr[k] = arr1[i];
                i++;
                k++;
            } else if (arr1[i] == arr2[j]) {
                newarr[k] = arr1[i];
                i++;
                j++;
                k++;
            }

        }
        while (i < n) {
            if (arr1[i] != newarr[k - 1]) {
                newarr[k] = arr1[i];
                k++;
                i++;

            } else {
                i++;
            }

        }
        while (j < m) {
            if (arr2[j] != newarr[k - 1]) {
                newarr[k] = arr2[j];
                k++;
                j++;
            } else {
                j++;
            }
        }
        for (int f = 0; f < k; f++) {
            System.out.print(newarr[f] + " ");

        }
    }

}
