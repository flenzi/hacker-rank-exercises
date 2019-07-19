package f.l.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {
        assertEquals(7, RepeatedString.repeatedString("aba", 10));
    }
}