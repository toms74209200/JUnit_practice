package junit.tutorial.ch9;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.fail;

public class TestNameExampleTest {

    @Rule
    public TestName testName = new TestName();

    @Ignore
    @Test
    public void fooTest() throws Exception {
        fail(testName.getMethodName() + " is not implement yet.");
    }
}
