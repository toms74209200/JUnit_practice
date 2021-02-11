package junit.tutorial.ch8;

import org.junit.Test;

import static org.assertj.core.api.Assumptions.assumeThat;
import static org.junit.Assert.fail;

public class AssumeTest {

    @Test
    public void testAssume() throws Exception {
        assumeThat(1).isEqualTo(0);
        fail();
    }
}
