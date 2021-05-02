package junit.tutorial.ch11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomsMockTest {

    @Test
    public void testChoiceReturnsA() throws Exception {
        List<String> options = new ArrayList<>();
        options.add("A");
        options.add("B");
        Randoms randoms = new Randoms();

        // set mock
        final AtomicBoolean isCallNextIntMethod = new AtomicBoolean(false);
        randoms.generator = new RandomNumberGenerator() {
            @Override
            public int nextInt() {
                isCallNextIntMethod.set(true);
                return 0;
            }
        };
        assertThat(randoms.choice(options)).isEqualTo("A");
        assertThat(isCallNextIntMethod.get()).isTrue();
    }
}
