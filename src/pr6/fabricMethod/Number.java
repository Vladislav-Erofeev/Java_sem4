package pr6.fabricMethod;

public class Number implements RealNumber{
    private double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public RealNumber sum(RealNumber n1) {
        return new Number(number + n1.getValue());
    }

    @Override
    public RealNumber sub(RealNumber n1) {
        return new Number(number - n1.getValue());
    }

    @Override
    public double getValue() {
        return number;
    }
}
