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

    @Test
    public void testDivideSuccessAs3by2() {
        Calculator calculator = new Calculator();
        float expected = 1.5f;
        float actual = calculator.divide(3, 2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideIllegalArdumentExceptionAs5by0() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }
}
