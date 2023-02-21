package pr6.fabricMethod;

public class IntNumberCreator implements Creator{
    @Override
    public RealNumber create(double n) {
        return new Number((int)n);
    }
}
