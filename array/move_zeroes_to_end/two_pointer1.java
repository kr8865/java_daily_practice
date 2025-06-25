package array.move_zeroes_to_end;

public class two_pointer1 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 4, 0, 0 };
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int k = j + 1; k < arr.length; k++) {
            if (arr[k] != 0) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
    }

}
