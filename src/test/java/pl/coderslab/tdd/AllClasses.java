package pl.coderslab.tdd;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.coderslab.tdd.assertions.MaxValueTest;
import pl.coderslab.tdd.assertions.SimpleCalculatorTest;
import pl.coderslab.tdd.creation.SampleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ MaxValueTest.class, SimpleCalculatorTest.class, SampleTest.class})
public class AllClasses {

}
