package junit.tutorial.sec4;

import org.assertj.core.api.AbstractAssert;

import java.util.Calendar;
import java.util.Date;

public class DateAssert extends AbstractAssert<DateAssert, Date> {

    public DateAssert(Date actual) {
        super(actual, DateAssert.class);
    }

    public static DateAssert assertThat(Date actual) {
        return new DateAssert(actual);
    }

    public DateAssert isDateOf(int yyyy, int mm, int dd) {
        isNotNull();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actual);
        if (yyyy != calendar.get(Calendar.YEAR)) {
            failWithMessage("expected year is <%s> but actual is <%s>", yyyy, calendar.get(Calendar.YEAR));
        }
        if (mm != calendar.get(Calendar.MONTH)+1) {
            failWithMessage("expected month is <%s> but actual is <%s>", mm, calendar.get(Calendar.MONTH));
        }
        if (dd != calendar.get(Calendar.DATE)) {
            failWithMessage("expected date is <%s> but actual is <%s>", dd, calendar.get(Calendar.DATE));
        }
        return this;
    }
}
