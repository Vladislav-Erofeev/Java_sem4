package pr6.prototype;

public class Test {
    public static void main(String[] args) {
        Object1 object1 = new Object1(5, 6, 7, 8);

        Object1 object2 = (Object1) object1.clone();

        object2.setVal1(10);
        System.out.println(object1.getVal1() + " " + object2.getVal1());
    }
}
