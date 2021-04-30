package junit.tutorial.ch9;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.fail;

public class TestWatcherExampleTest {

    @Rule
    public TestWatcher testWatcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {
            Logger.getAnonymousLogger()
                    .info("start: " + description.getMethodName());
        }

        @Override
        protected void succeeded(Description description) {
            Logger.getAnonymousLogger()
                    .info("succeeded: " + description.getMethodName());
        }

        @Override
        protected void failed(Throwable e, Description description) {
            Logger.getAnonymousLogger()
                    .log(Level.WARNING, "failed: " + description.getMethodName());
        }

        @Override
        protected void finished(Description description) {
            Logger.getAnonymousLogger()
                    .info("finished: " + description.getMethodName());
        }
    };

    @Test
    public void successTest() throws Exception {}

    @Ignore
    @Test
    public void failureTest() throws Exception {
        fail("NG");
    }
}
