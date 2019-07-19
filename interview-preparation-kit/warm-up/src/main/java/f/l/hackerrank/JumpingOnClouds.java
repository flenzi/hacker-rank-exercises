package f.l.hackerrank;

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {
        int numberOfJumps = 0;
        int index = 0;

        while (index != c.length - 1) {
            if (index + 2 < c.length && c[index + 2] == 0) index = index + 2;
            else index++;
            numberOfJumps++;
        }

        return numberOfJumps;
    }
}
