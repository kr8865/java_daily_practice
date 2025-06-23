package second_largest_ele;

public class better_appraoch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        for (int j = 1; j < arr.length; j++) {
            if (second_max < arr[j] && arr[j] != max) {
                second_max = arr[j];
            }
            if (second_min > arr[j] && arr[j] != min) {
                second_min = arr[j];
            }
        }
        System.out.println(second_max);
        System.out.print(second_min);

    }

}
