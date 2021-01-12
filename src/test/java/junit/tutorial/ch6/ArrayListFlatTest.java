package junit.tutorial.ch6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListFlatTest {

    private ArrayList<String> sut;

    @Before
    public void setUp() throws Exception {
        sut = new ArrayList<>();
    }

    @Test
    public void testSizeListContains1DataReturns1() {
        sut.add("A");
        int actual = sut.size();
        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testSizeListContains2DataReturns2() {
        sut.add("A");
        sut.add("B");
        int actual = sut.size();
        assertThat(actual).isEqualTo(2);
    }
}
