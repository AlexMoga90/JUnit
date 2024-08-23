package pl.coderslab.tdd.tdd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FactorsTest {
    @Test
    public void testFactors() {
        List<Integer> factoriPrimi = Factors.generatePrimeFactors(10);
        assertEquals(2, factoriPrimi.size());
        assertTrue(factoriPrimi.containsAll(List.of(2, 5)));
    }
}
