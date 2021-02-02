package junit.tutorial.ch8;

import junit.tutorial.ch5.Calculator;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Theories.class)
public class CalculatorDataPointTest {

    @DataPoint
    public static Fixture PARAM_1 = new Fixture(3, 4, 7);
    @DataPoint
    public static Fixture PARAM_2 = new Fixture(0, 5, 5);
    @DataPoint
    public static Fixture PARAM_3 = new Fixture(-3, 1, -2);

    @Theory
    public void testAdd(Fixture p) throws Exception {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(p.x, p.y)).isEqualTo(p.expected);
    }

    static class Fixture {
        int x;
        int y;
        int expected;

        Fixture(int x, int y, int expected) {
            this.x = x;
            this.y = y;
            this.expected = expected;
        }
    }
}
