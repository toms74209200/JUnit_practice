package junit.tutorial.ch8;

public class Members {

    public static boolean canRegister(int age) {
        return 18 <= age;
    }

    public static boolean isSpecialMember(int age, boolean isRegisterMainMagazine, int usePastMonth) {
        if (age < 20) {
            return false;
        }
        if (!isRegisterMainMagazine) {
            return false;
        }
        if (usePastMonth < 1) {
            return false;
        }
        return true;
    }
}
