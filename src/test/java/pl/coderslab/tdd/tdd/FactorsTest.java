package pl.coderslab.tdd.tdd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class FactorsTest {
    @Test
    public void testFactors() {
       List<Integer> factoriPrimi = Factors.generatePrimeFactors(30);
        assertNotEquals(0,factoriPrimi.size());
    }
}
