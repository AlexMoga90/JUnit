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
    public void addPositive() {
        try{
            simpleCalculator.addPositive(-3,2);
            throw new IllegalArgumentException("Something went wrong");
        }catch (IllegalArgumentException e){
            assertEquals("Only positive", e.getMessage());
        }
        assertEquals(13,simpleCalculator.addPositive(5, 8));
    }
}