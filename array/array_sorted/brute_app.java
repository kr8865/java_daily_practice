package array.array_sorted;

public class brute_app {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 };
        boolean val = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    val = false;
                    break;
                }
            }
        }
        if (val == true) {
            System.out.print("true");
        } else {
            System.out.println("false");
        }
    }

}
