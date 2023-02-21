package pr6.abstractFactory;

public class ConcreteFactory implements AbstractFactory{
    @Override
    public Number createRealNumber(int re, int im) {
        return new Number(re, im);
    }

    @Override
    public Number createComplexNumber(int im) {
        return new Number(0, im);
    }
}
