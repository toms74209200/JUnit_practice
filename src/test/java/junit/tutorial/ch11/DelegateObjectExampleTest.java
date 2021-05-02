package junit.tutorial.ch11;

import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class DelegateObjectExampleTest {

    @Test
    public void testDoSomethingReturnsNow() {
        final Date current = new Date();
        DelegateObjectExample delegateObjectExample = new DelegateObjectExample();
        delegateObjectExample.dateFactory = new DateFactory() {
            @Override
            public Date newDate() {
                return current;
            }
        };

        delegateObjectExample.doSomething();
        assertThat(delegateObjectExample.date).isSameAs(current);
    }
}
