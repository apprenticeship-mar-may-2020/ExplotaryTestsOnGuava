import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

public class ExploratoryGuavaReflectionTests {

  @Test
  public void check_method_is_public() throws NoSuchMethodException {
    Method method = Service.class.getMethod("foo");
    Invokable<Service, ?> invokable = new TypeToken<Service>() {
    }.method(method);

    assertTrue(invokable.isPublic());
  }

  @Test
  public void bar_should_be_overridable() throws NoSuchMethodException {
    Method method = Service.class.getMethod("bar");
    Invokable<Service, ?> invokable = new TypeToken<Service>() {
    }.method(method);

    assertTrue(invokable.isOverridable());
  }

  @Test
  public void foo_should_not_be_overridable() throws NoSuchMethodException {
    Method method = Service.class.getMethod("foo");
    Invokable<Service, ?> invokable = new TypeToken<Service>() {
    }.method(method);

    assertFalse(invokable.isOverridable());
  }


}
