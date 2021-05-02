package junit.tutorial.ch11;

import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodExtractExampleTest {

    @Test
    public void testDoSomethingReturnsNow() {
        final Date current = new Date();
        MethodExtractExample methodExtractExample = new MethodExtractExample() {
            @Override
            Date newDate() {
                return current;
            }
        };

        methodExtractExample.doSomething();
        assertThat(methodExtractExample.date).isSameAs(current);
    }
}
