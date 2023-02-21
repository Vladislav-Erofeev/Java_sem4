package pr5;

public class Main {
    public static void main(String[] args) {
        SingletonOne singletonOne = SingletonOne.getInstance(5);
        System.out.println(singletonOne.getField());
        SingletonOne singletonOne1 = SingletonOne.getInstance(10);
        System.out.println(singletonOne1.getField());

        SingletoneTwo singletoneTwo = SingletoneTwo.getInstance();

        SingletonThree singletonThree = SingletonThree.INSTANCE;
        System.out.println(singletonThree.getField());
    }
}