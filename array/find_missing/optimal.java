package array.find_missing;

public class optimal {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);

        }
        xor2 = xor2 ^ n;
        System.out.print(xor1 ^ xor2);
    }

}
