package pl.coderslab.tdd.junit;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CalculatorTest extends TestCase {

    private Calculator calculator;

    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Integer addition = calculator.add(10, 5);
        assertThat(addition, is(15));
    }

    @Test
    public void testSubtract() {
        assertThat(5, is(equalTo(calculator.subtract(10, 5))));
    }

    @Test
    public void testMultiply() {
        assertEquals(54, calculator.multiply(9, 6));
    }

    @Test
    public void testDivide() {
        assertEquals(3.0, calculator.divide(9, 3));
    }

    @Test
    public void testGreater() {
        assertThat(calculator.greater(10, 5), is(true));
    }
}