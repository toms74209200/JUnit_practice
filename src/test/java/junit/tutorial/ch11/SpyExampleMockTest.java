package junit.tutorial.ch11;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.spy;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.logging.Logger;

public class SpyExampleMockTest {

    @Test
    public void testDoSomethingUseMockitoSpy() {
        //SetUp
        SpyExample spyExample = new SpyExample();
        Logger loggerSpy = spy(spyExample.logger);
        final StringBuilder infoLog = new StringBuilder();
        doAnswer(new Answer<Void>() {
            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                infoLog.append(invocation.getArguments()[0]);
                invocation.callRealMethod();
                return null;
            }
        }).when(loggerSpy).info(anyString());

        spyExample.logger = loggerSpy;

        //Exercise
        spyExample.doSomething();
        //Verify
        assertThat(infoLog.toString()).isEqualTo("doSomething");
    }
}