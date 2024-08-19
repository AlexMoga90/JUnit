package pl.coderslab.tdd.assertions;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueTest {

    @Test
    public void largest() {
        int[] array1 = new int[]{1, 2, 3,248};
        assertEquals(248, MaxValue.largest(array1));
    }
}