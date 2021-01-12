package junit.tutorial.ch5;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    public void testAddAs3And4Returns7() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(3, 4)).isEqualTo(7);
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main(CalcTest.class.getName());
    }
}
