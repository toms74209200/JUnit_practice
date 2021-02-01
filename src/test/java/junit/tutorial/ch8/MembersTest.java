package junit.tutorial.ch8;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class MembersTest {

    Random random = new Random();

    @Test
    public void testCanRegisterUnder18ReturnsFalse() {
        int age = random.nextInt(18);
        assertThat(Members.canRegister(age)).isFalse();
    }

    @Test
    public void testCanRegisterOver18ReturnsTrue() {
        int age = random.nextInt(100)+18;
        assertThat(Members.canRegister(age)).isTrue();
    }

    @Test
    public void testIsSpecialMemberAge20IsRegisterOver1MonthReturnsTrue() {
        assertThat(Members.isSpecialMember(20, true, 1)).isTrue();
    }

    @Test
    public void testIsSpecialMemberAge19IsRegisterOver1MonthReturnsFalse() {
        assertThat(Members.isSpecialMember(19, true, 1)).isFalse();
    }

    @Test
    public void testIsSpecialMemberAge20IsNotRegisterOver1MonthReturnsFalse() {
        assertThat(Members.isSpecialMember(20, false, 1)).isFalse();
    }

    @Test
    public void testIsSpecialMemberAge20InRegisterUnder1MonthReturnsFalse() {
        assertThat(Members.isSpecialMember(20, true, 0)).isFalse();
    }

}
