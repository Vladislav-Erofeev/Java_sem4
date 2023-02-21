package pr6.abstractFactory;

public interface AbstractFactory {
    Number createRealNumber(int re, int im);
    Number createComplexNumber(int im);
}
