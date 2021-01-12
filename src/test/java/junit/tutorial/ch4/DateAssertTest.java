package junit.tutorial.ch4;

import org.junit.Test;

import java.util.Date;

import static junit.tutorial.ch4.DateAssert.*;

public class DateAssertTest {

    @Test
    public void testDate() {
        Date date = new Date();
        date.setTime(1297263600000L);
        assertThat(date).isDateOf(2011, 0x02, 10);
    }
}
