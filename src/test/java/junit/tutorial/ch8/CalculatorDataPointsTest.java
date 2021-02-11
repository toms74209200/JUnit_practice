package junit.tutorial.ch8;

import junit.tutorial.ch5.Calculator;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Theories.class)
public class CalculatorDataPointsTest {

    @DataPoints
    public static Fixture[] PARAMs = {
            new Fixture(3, 4, 7),
            new Fixture(0, 5, 5),
            new Fixture(-3, 1, -2)
    };

    @Theory
    public void testAdd(Fixture p) {
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
