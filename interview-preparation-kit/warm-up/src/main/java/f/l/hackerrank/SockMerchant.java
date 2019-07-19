package f.l.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> sockMap = new HashMap<>();

        Arrays.stream(ar).forEach(e -> {
            Integer currentValueForThatSock = sockMap.getOrDefault(e, 0);
            sockMap.put(e, ++currentValueForThatSock);
        });

        return sockMap.values().stream().map(e -> e / 2).mapToInt(i -> i).sum();
    }
}
