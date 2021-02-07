package junit.tutorial.ch8;

public class Member {
    public static boolean canEntry(int age, Gender gender) {
        if (gender == Gender.MALE) return false;
        return 25 >= age;
    }
}
