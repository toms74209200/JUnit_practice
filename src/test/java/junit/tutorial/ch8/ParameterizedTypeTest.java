package junit.tutorial.ch8;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ParameterizedTypeTest {

    @DataPoint
    public static int INT_PARAM_1 = 3;
    @DataPoint
    public static int INT_PARAM_2 = 4;

    @DataPoint
    public static String STRING_PARAM_1 = "Hello";
    @DataPoint
    public static String STRING_PARAM_2 = "World";

    @Theory
    public void testArgumentTypeIsInt(int param) throws Exception {
        System.out.println("The type of argument that test method has is int: "+param);
    }

    @Theory
    public void testArgumentTypeIsString(String param) throws Exception {
        System.out.println("The type of argument that test method has is String: "+param);
    }
}
