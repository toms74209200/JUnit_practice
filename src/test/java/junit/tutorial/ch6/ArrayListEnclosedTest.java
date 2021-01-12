package junit.tutorial.ch6;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Enclosed.class)
public class ArrayListEnclosedTest {

    public static class ListContains1DataCase {

        private ArrayList<String> sut;

        @Before
        public void setUp() throws Exception {
            sut = new ArrayList<>();
            sut.add("A");
        }

        @Test
        public void testSizeReturns1() throws Exception {
            int actual = sut.size();
            assertThat(actual).isEqualTo(1);
        }
    }

    public static class ListContains2DataCase {

        private ArrayList<String> sut;

        @Before
        public void setUp() throws Exception {
            sut = new ArrayList<>();
            sut.add("A");
            sut.add("B");
        }

        @Test
        public void testSizeReturns2() throws Exception {
            int actual = sut.size();
            assertThat(actual).isEqualTo(2);
        }
    }
}
