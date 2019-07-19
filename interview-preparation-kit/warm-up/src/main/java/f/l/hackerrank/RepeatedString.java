package f.l.hackerrank;

public class RepeatedString {

    static long getNumberOfOcurrences(String s) {
        return s.length() - s.replace("a", "").length();
    }

    static long repeatedString(String s, long n) {
        long totalnNumberOfOcurrences = getNumberOfOcurrences(s) * (n / (long) s.length());
        if (n % s.length() > 0) {
            totalnNumberOfOcurrences += getNumberOfOcurrences(s.substring(0, (int) (n % (long) s.length())));
        }
        return totalnNumberOfOcurrences;
    }
}
