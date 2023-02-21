package pr6.prototype;

public class Object1 implements Prototype{
    public int val1 = 1;
    public int val2 = 2;
    public int val3 = 3;
    public int val4 = 4;

    public Object1(int val1, int val2, int val3, int val4) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
    }

    public Object1() {

    }

    @Override
    public Prototype clone() {
        return new Object1(val1, val2, val3, val4);
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getVal3() {
        return val3;
    }

    public void setVal3(int val3) {
        this.val3 = val3;
    }

    public int getVal4() {
        return val4;
    }

    public void setVal4(int val4) {
        this.val4 = val4;
    }
}
