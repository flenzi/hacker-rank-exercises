package f.l.hackerrank;

public class MinimumSwaps {

    static int minimumSwaps(int[] arr) {
        int swaps = 0;

        for (int i = 0; i < arr.length; i++) {
            while (i + 1 != arr[i]) {
                int aux = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[aux -1] = aux;
                swaps++;
            }
        }
        return swaps;
    }
}
