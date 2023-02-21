package pr5;

public enum SingletonThree {
    INSTANCE;
    private int field = 4;

    public int getField() {
        return field;
    }
}
