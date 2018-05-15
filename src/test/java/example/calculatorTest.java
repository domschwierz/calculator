package example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class calculatorTest {

    calculator calc;

    @Before
    public void before(){
        calc = new calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0}, {1, 2}, {2, 4}, {3, 6},{4, 8}, {5, 10}, {6, 12}});
    }

    private int intPut;
    private int intPected;

    public calculatorTest(int input, int expected) {
        intPut = input;
        intPected = expected;
    }

    @Test
    public void test() {
        assertEquals(intPected, calc.addition(intPut,intPut));
    }
}
