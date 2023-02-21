package pr6.Builder;

public class Test {
    public static void main(String[] args) {
        Builder realBuilder = new RealNumberBuilder();
        Builder complexBuilder = new ComplexNumberBuilder();
        Builder builder = new NumberBuilder();
        Director director = new Director();

        director.setBuilder(realBuilder);
        System.out.println(director.construct(1, 2, 3));

        director.setBuilder(complexBuilder);
        System.out.println(director.construct(1, 2, 3));

        director.setBuilder(builder);
        System.out.println(director.construct(1, 2, 3));
    }
}
