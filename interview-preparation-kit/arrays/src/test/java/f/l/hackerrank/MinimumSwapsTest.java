package f.l.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSwapsTest {
    @Test
    public void minimumSwaps() {
        assertEquals(3, MinimumSwaps.minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}));
    }

}