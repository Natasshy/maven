package Task8;

import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    private Calcul calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void unitTest() {
        calculator = new Calcul();
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void testGetSum() throws Exception {
        assertEquals(15.0, calculator.Plus(7,8));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(20.0, calculator.Divide(100,5));
    }

    @Test
    public void testGetMultiple() throws Exception {

    }

    @Test
    public void divisionWithException() {
        calculator.Divide(15,0);
    }



}



