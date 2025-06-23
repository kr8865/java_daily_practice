package array.rotate_arr;

public class brtap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // time complexity-o(n) and space -o(n)
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i + 1];
        }
        temp[arr.length - 1] = arr[0];
        for (int k = 0; k < arr.length; k++) {
            System.out.println(temp[k]);
        }

    }

}
