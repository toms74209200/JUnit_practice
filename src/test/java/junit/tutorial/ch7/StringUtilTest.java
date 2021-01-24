package junit.tutorial.ch7;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilTest {

    @Test
    public void testIsEmptyOrNullEmptyReturnsNull() throws Exception {
        // SetUp
        String input = "";
        // Exercise
        boolean actual = StringUtil.isEmptyOrNull(input);
        // Verify
        assertThat(actual).isTrue();
    }

    @Test
    public void testIsEmptyOrNullAAAReturnsFalse() throws Exception {
        // SetUp
        String input = "AAA";
        // Exercise
        boolean actual = StringUtil.isEmptyOrNull(input);
        // Verify
        assertThat(actual).isFalse();
    }
}
