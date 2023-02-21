package pr6.abstractFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        Number number1 = factory.createRealNumber(1, 2);
        System.out.println(number1);
        number1 = factory.createComplexNumber(5);
        System.out.println(number1);
    }
}
