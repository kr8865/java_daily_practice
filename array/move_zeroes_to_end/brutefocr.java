package array.move_zeroes_to_end;

public class brutefocr {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 6, 5, 6, 7 };
        int n = arr.length;
        int j = 0;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int k = j; k < n; k++) {
            temp[k] = 0;
        }
        for (int f = 0; f < n; f++) {
            System.out.print(temp[f] + " ");
        }

    }

}
