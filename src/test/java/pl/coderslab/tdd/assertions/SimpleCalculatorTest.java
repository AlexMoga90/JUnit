package pl.coderslab.tdd.assertions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    private SimpleCalculator simpleCalculator;

    @Before
    public void setUp(){
        this.simpleCalculator = new SimpleCalculator();
    }
    @Test
    public void add() {
        assertEquals(13,simpleCalculator.add(5, 8) );
    }

    @Test
    public void addPositve() {
    }
}