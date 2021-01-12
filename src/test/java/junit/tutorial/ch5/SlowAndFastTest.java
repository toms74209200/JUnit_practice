package junit.tutorial.ch5;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.fail;

public class SlowAndFastTest {
    @Test
    public void fastTest_01() throws Exception {
        System.out.println("fast test 01 execute");
    }

    @Ignore
    @Test
    @Category(SlowTest.class)
    public void slowTest_01() throws Exception {
        System.out.println("slow test 01 execute");
        fail();
    }

    @Ignore
    @Test
    @Category(SlowTest.class)
    public void slowTest_02() throws Exception {
        System.out.println("slow test 02 execute");
        fail();
    }
}
