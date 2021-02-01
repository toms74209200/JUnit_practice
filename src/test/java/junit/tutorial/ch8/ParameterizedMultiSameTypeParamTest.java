package junit.tutorial.ch8;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ParameterizedMultiSameTypeParamTest {

    @DataPoint
    public static int INT_PARAM_1 = 3;
    @DataPoint
    public static int INT_PARAM_2 = 4;

    @Theory
    public void testMethod(int x, int y) {
        System.out.printf("x: %d, y: %d \n", x, y);
    }
}
