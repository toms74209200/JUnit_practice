package junit.tutorial.ch8;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;

@RunWith(Theories.class)
public class MemberTest {

    @DataPoints
    public static int[] AGES = {15, 20, 25, 30};
    @DataPoints
    public static Gender[] GENDERS = Gender.values();

    @Theory
    public void testCanEntryWithUnder25FemaleReturnsTrue(int age, Gender gender) throws Exception {
        assumeThat(age).isLessThanOrEqualTo(25);
        assumeThat(gender).isEqualTo(Gender.FEMALE);
        assertThat(Member.canEntry(age, gender)).isTrue();
    }

    @Theory
    public void testCanEntryWithNotUnder25FemaleReturnsFalse(int age, Gender gender) throws Exception {
        assumeThat(age).isGreaterThan(25);
        assumeThat(gender).isNotEqualTo(Gender.FEMALE);
        assertThat(Member.canEntry(age, gender)).isFalse();
    }
}
