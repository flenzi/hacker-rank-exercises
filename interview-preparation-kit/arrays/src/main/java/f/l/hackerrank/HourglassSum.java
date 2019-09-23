package f.l.hackerrank;

public class HourglassSum {

    private static int[][] coordinates = {
            {1, 1},
            {2, 1},
            {3, 1},
            {4, 1},

            {1, 2},
            {2, 2},
            {3, 2},
            {4, 2},

            {1, 3},
            {2, 3},
            {3, 3},
            {4, 3},

            {1, 4},
            {2, 4},
            {3, 4},
            {4, 4},
    };

    static int hourglassSum(int[][] arr) {
        int maxHourGlass = -9999999;

        for (int i = 0; i < coordinates.length; i++) {
            int hourGlass = calculateHourGlass(arr, coordinates[i][0], coordinates[i][1]);
            if (hourGlass > maxHourGlass) {
                maxHourGlass = hourGlass;
            }
        }
        return maxHourGlass;
    }

    private static int calculateHourGlass(int[][] arr, int x, int y) {
        return arr[x - 1][y - 1] + arr[x - 1][y] + arr[x - 1][y + 1] +
                arr[x][y] +
                arr[x + 1][y - 1] + arr[x + 1][y] + arr[x + 1][y + 1];
    }

}
