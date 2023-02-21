package pr6.fabricMethod;

public class Test {
    public static void main(String[] args) {
        RealNumberCreator realNumberCreator = new RealNumberCreator();
        IntNumberCreator intNumberCreator = new IntNumberCreator();
        RealNumber number1 = realNumberCreator.create(12.5);
        System.out.println(number1.getValue());
        number1 = intNumberCreator.create(12.5);
        System.out.println(number1.getValue());
    }
}
