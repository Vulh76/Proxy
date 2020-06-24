package stb.lessons;

public class CalculatorImpl implements Calculator{

    @Override
    public int squared(int val) {
        return val * val;
    }

    @Override
    public int doubling(int val) {
        return val + val;
    }
}
