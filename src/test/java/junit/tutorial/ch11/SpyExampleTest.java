package junit.tutorial.ch11;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpyExampleTest {

    @Test
    public void testDoSomething() {
        SpyExample spyExample = new SpyExample();
        SpyLogger spyLogger = new SpyLogger(spyExample.logger);
        spyExample.logger = spyLogger;

        spyExample.doSomething();
        assertThat(spyLogger.log.toString()).isEqualTo("doSomething");
    }
}
