package junit.tutorial.ch11;

public class RandomNumberGeneratorStub implements RandomNumberGenerator {

    private final int num;

    public RandomNumberGeneratorStub(int num) {
        this.num = num;
    }

    @Override
    public int nextInt() {
        return num;
    }
}
