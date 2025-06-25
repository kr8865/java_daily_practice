package array.move_zeroes_to_end;

public class two_pointer {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 0, 5, 0 };
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[j] == 0) {
                j--;
            } else if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            } else {
                i++;
            }
        }
        for (int f = 0; f < arr.length; f++) {
            System.out.print(arr[f] + " ");
        }
    }

}
