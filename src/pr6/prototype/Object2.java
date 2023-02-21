package pr6.prototype;

public class Object2 implements Prototype{
    public int val1 = 1;
    public int val2 = 2;
    public int val3 = 3;
    public int val4 = 4;

    public Object2(int val1, int val2, int val3, int val4) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
    }

    public Object2() {

    }

    @Override
    public Prototype clone() {
        return new Object1(val1, val2, val3, val4);
    }
}
