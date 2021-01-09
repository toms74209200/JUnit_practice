package junit.tutorial;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void testMultiplySuccessAs3and4() {
        Calculator calculator = new Calculator();
        int expected = 12;
        int actual = calculator.multiply(3, 4);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testMultiplySuccessAs5and7() {
        Calculator calculator = new Calculator();
        int expected = 35;
        int actual = calculator.multiply(5, 7);
        assertThat(actual).isEqualTo(expected);
    }
}
