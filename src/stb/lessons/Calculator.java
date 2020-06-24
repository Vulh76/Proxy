package stb.lessons;

public interface Calculator {
    @Cache
    int squared(int val);

    int doubling(int val);
}
