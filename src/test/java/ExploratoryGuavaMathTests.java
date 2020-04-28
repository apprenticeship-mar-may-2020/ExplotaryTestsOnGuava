import static com.google.common.math.IntMath.gcd;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.common.math.IntMath;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ExploratoryGuavaMathTests {

  @Test
  public void checkedAd_should_add_two_numbers() {
    assertEquals(IntMath.checkedAdd(1, 1), 2);
  }

  @Test
  public void checkedAdd_should_throw_ArithmeticException() {
    assertThrows(ArithmeticException.class, () -> IntMath.checkedAdd(Integer.MAX_VALUE, 1));
  }

  @Test
  public void gcd_should_return_1_on_35_and_44() {
    assertEquals(gcd(35, 44), 1);
  }

  @Test
  public void gcd_should_return_16_on_16_and_32() {
    assertEquals(gcd(16, 32), 16);
  }

  @Test
  @Disabled
  public void java_math_add_does_not_throw_exception_on_max_value() {
    assertDoesNotThrow(() -> IntMath.checkedAdd(Integer.MAX_VALUE, 1));
  }


}
