package junit.tutorial.ch11;

import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class DelegateObjectExampleSimpleTest {

    @Test
    public void testDoSomethingReturnsNow() {
        final Date current = new Date();
        DelegateObjectExampleSimple delegateObjectExampleSimple = new DelegateObjectExampleSimple();
        delegateObjectExampleSimple.dateFactorySimple = new DateFactorySimple() {
            @Override
            Date newDate() {
                return current;
            }
        };

        delegateObjectExampleSimple.doSomething();
        assertThat(delegateObjectExampleSimple.date).isSameAs(current);
    }
}
