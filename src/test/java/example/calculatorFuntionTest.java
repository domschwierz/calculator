package example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calculatorFuntionTest {

    calculator calc;

    @Before
    public void before(){
        calc = new calculator();
    }

    @Test
    public void additionTest(){
        assertEquals(10,calc.addition(5,5));
    }

    @Test
    public void subtractionTest(){
        assertEquals(10,calc.subtraction(20,10));
    }

    @Test
    public void multiplicationTest(){
        assertEquals(10,calc.multiplication(2,5));
    }

    @Test
    public void divisionTest(){
        assertEquals(2,calc.division(10,5));
    }
}
