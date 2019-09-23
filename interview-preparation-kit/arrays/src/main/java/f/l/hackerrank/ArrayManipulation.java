package f.l.hackerrank;

public class ArrayManipulation {

    static long arrayManipulation(int arraySize, int[][] queries) {

        long[] values = new long[arraySize + 2];

        //Just updates 2 indexes, first index summing value and second index subtracting it. Middle indexes are not modified.
        for (int[] query : queries) {
            values[query[0]] += query[2];
            values[query[1] + 1] -= query[2];
        }

        return getMax(values);
    }

    private static long getMax(long[] values) {
        long max = Long.MIN_VALUE;

        long sum = 0l;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            max = Math.max(max, sum);
        }

        return max;
    }


}
