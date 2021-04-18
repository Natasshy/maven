package Task8;

;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testGetSum() throws Exception {
        Calcul calculator = new Calcul();
        assertEquals(15, calculator.Plus(7, 8),0);
    }

    @Test
    public void testGetDivide() throws Exception {
        Calcul calculator = new Calcul();
        assertEquals(20, calculator.Divide(100, 5), 0);
    }


    @Test
    public void divisionWithException() {
        Calcul calculator = new Calcul();
        calculator.Divide(15, 0);
    }
}



