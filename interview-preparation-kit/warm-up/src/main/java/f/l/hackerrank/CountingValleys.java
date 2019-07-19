package f.l.hackerrank;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int currentLevel = 0;
        int numberOfValleys = 0;

        for (char c : s.toCharArray()) {
            if (currentLevel == -1 && c == 'U') {
                numberOfValleys++;
            }
            if (c == 'D') {
                currentLevel--;
            } else {
                currentLevel++;
            }
        }
        return numberOfValleys;
    }

}
