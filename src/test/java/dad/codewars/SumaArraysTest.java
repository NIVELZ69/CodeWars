package dad.codewars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumaArraysTest {

  @Test
  public void testSum() {
    assertEquals(0,      SumaArrays.suma(new double[] { }),                1e-4);
    assertEquals(-2.398, SumaArrays.suma(new double[] {-2.398}),           1e-4);
    assertEquals(6,      SumaArrays.suma(new double[] {1, 2, 3}),          1e-4);
    assertEquals(6.6,    SumaArrays.suma(new double[] {1.1, 2.2, 3.3}),    1e-4);
    assertEquals(9.2,    SumaArrays.suma(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
    assertEquals(320,    SumaArrays.suma(new double[] {30, 89, 100, 101}), 1e-4);
  }
}