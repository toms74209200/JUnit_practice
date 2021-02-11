package junit.tutorial.ch9;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutExampleTest {

    @Rule
    public Timeout timeout = new Timeout(100, TimeUnit.MILLISECONDS);

    @Ignore
    @Test
    public void testMayLongTime() throws Exception {
        doLongTask();
    }

    private void doLongTask() throws InterruptedException {
        Thread.sleep(101);
    }
}
