package array.array_sorted;

public class better_app {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        boolean val = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                val = false;
                break;
            }
        }
        if (val == false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }

    public static void reverse(int i, int j, int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }

}
