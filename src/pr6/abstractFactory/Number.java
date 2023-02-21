package pr6.abstractFactory;

public class Number {
    private int re = 0;
    private int im = 0;

    public Number(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public String toString() {
        if (im == 0) {
            return re + " ";
        } else if(re == 0) {
            return im + "i";
        }
        return re + " + " + im + "i";
    }
}
