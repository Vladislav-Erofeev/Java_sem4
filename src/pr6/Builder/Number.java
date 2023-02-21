package pr6.Builder;

public class Number {
    private int re = 0;
    private int im = 0;
    private int j = 0;

    public Number(int re, int im, int j) {
        this.re = re;
        this.im = im;
        this.j = j;
    }

    public String toString() {
        return re + " + " + im + "i + " + j  + "j";
    }
}
