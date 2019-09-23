package f.l.hackerrank;

public class Rotation {

    static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            rotate(a);
        }
        return a;
    }

    private static int[] rotate(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        return arr;
    }
}
