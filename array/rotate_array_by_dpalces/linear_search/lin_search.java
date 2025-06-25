package array.rotate_array_by_dpalces.linear_search;

public class lin_search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        boolean val = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                val = true;
                break;
            }
        }
        if (val == true) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }

}
