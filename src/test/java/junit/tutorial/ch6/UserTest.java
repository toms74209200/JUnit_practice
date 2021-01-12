package junit.tutorial.ch6;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Enclosed.class)
public class UserTest {

    public static class InstantiationTest {

        @Test
        public void testDefaultConstructor() {
            User instance = new User();
            assertThat(instance.getName()).isEqualTo("nobody");
            assertThat(instance.isAdmin()).isFalse();
        }
    }
}
