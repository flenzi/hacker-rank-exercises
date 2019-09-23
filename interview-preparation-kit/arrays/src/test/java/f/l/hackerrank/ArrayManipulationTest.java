package f.l.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayManipulationTest {

    @Test
    public void testExample() {
        int arraySize = 5;
        int[][] operations = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };
        assertEquals(200, ArrayManipulation.arrayManipulation(arraySize, operations));
    }

    @Test
    public void textExample2() {
        int arraySize = 4;
        int[][] operations = {
                {2, 3, 603},
                {1, 1, 286},
                {4, 4, 882}
        };
        assertEquals(882, ArrayManipulation.arrayManipulation(arraySize, operations));

    }

}