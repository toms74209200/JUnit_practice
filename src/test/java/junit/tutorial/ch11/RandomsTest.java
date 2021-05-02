package junit.tutorial.ch11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomsTest {

    @Test
    public void testChoiceReturnsA() throws Exception {
        List<String> options = new ArrayList<>();
        options.add("A");
        options.add("B");
        options.add("C");
        Randoms randoms = new Randoms();

        // set stub
        randoms.generator = new RandomNumberGenerator() {
            @Override
            public int nextInt() {
                return 0;
            }
        };

        assertThat(randoms.choice(options)).isEqualTo("A");
    }

    @Test
    public void testChoiceReturnsB() throws Exception {
        List<String> options = new ArrayList<>();
        options.add("A");
        options.add("B");
        options.add("C");
        Randoms randoms = new Randoms();

        randoms.generator = new RandomNumberGeneratorFixedResultStub();

        assertThat(randoms.choice(options)).isEqualTo("B");
    }

    @Test
    public void testChoiceReturnsC() throws Exception {
        List<String> options = new ArrayList<>();
        options.add("A");
        options.add("B");
        options.add("C");
        Randoms randoms = new Randoms();

        randoms.generator = new RandomNumberGeneratorStub(2);

        assertThat(randoms.choice(options)).isEqualTo("C");
    }
}
