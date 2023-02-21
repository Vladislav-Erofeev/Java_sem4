package pr6.fabricMethod;

public class RealNumberCreator implements Creator{
    @Override
    public RealNumber create(double n) {
        return new Number(n);
    }
}
