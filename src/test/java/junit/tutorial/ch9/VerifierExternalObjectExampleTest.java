package junit.tutorial.ch9;

import org.junit.Rule;
import org.junit.Test;

public class VerifierExternalObjectExampleTest {

    ErrorLog log = new ErrorLog();

    @Rule
    public ErrorLogVerifier errorLogVerifier = new ErrorLogVerifier(log);

    @Test
    public void test() {}
}
