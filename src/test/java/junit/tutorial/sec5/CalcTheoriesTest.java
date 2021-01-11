package junit.tutorial.sec5;

import junit.tutorial.sec5.Calculator;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Theories.class)
public class CalcTheoriesTest {
    @DataPoints
    public static int[][] VALUES = {
            {0, 0, 0},
            {0, 1, 1},
            {1, 0, 1},
            {3, 4, 7}
    };

    @Theory
    public void add(int[] values) throws Exception {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(values[0], values[1])).isEqualTo(values[2]);
    }
}
