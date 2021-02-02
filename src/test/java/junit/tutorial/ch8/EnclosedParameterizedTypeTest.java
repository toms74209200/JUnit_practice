package junit.tutorial.ch8;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class EnclosedParameterizedTypeTest {

    @RunWith(Theories.class)
    public static class ParameterizedTestOfInt {

        @DataPoint
        public static int INT_PARAM_1 = 3;
        @DataPoint
        public static int INT_PARAM_2 = 4;

        @Theory
        public void testArgumentTypeIsInt(int param) throws Exception {
            System.out.println("The type of argument that test method has is int: "+param);
        }
    }

    @RunWith(Theories.class)
    public static class ParameterizedTestOfString {

        @DataPoint
        public static String STRING_PARAM_1 = "Hello";
        @DataPoint
        public static String STRING_PARAM_2 = "World";

        @Theory
        public void testArgumentTypeIsString(String param) throws Exception {
            System.out.println("The type of argument that test method has is String: "+param);
        }
    }
}
