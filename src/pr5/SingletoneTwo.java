package pr5;

public class SingletoneTwo {
    private int field1;

    private SingletoneTwo() {

    }

    private SingletoneTwo(int n) {
        field1 = n;
    }

    private static class SingletonLoader {
        private static final SingletoneTwo instance = new SingletoneTwo(0);
    }

    public static SingletoneTwo getInstance() {
        return SingletonLoader.instance;
    }
}
