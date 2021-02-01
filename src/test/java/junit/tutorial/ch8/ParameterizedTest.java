package junit.tutorial.ch8;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ParameterizedTest {

    @DataPoint
    public static int INT_PARAM_1 = 3;
    @DataPoint
    public static int INT_PARAM_2 = 4;

    public ParameterizedTest() {
        System.out.println("Initialization");
    }

    @Theory
    public void testMethodHasArgument(int param) throws Exception {
        System.out.println("Test method has a argument :"+param);
    }
}
