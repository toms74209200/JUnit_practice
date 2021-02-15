package junit.tutorial.ch9;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExceptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testThrowsException() throws Exception {
        throw new IllegalArgumentException();
    }

    @Test
    public void testThrowsExceptionAndErrorMessage() throws Exception {
        try {
            throwNewIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("argument is null.");
        }
    }

    private void throwNewIllegalArgumentException() throws IllegalArgumentException {
        throw new IllegalArgumentException("argument is null.");
    }
}
