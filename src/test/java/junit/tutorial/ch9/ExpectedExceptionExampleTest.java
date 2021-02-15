package junit.tutorial.ch9;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionExampleTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testThrowsExceptionAndErrorMessage() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("argument is null.");
        throw new IllegalArgumentException("argument is null.");
    }
}
