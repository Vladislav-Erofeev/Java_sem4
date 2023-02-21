package pr5;

public class SingletonOne {
    private static SingletonOne singletonOne;
    int field1;
    private SingletonOne() {
        field1 = 0;
        singletonOne = this;
    }

    private SingletonOne(int n) {
        field1 = n;
        singletonOne = this;
    }


    public synchronized static SingletonOne getInstance() {
        if(singletonOne == null) {
            singletonOne = new SingletonOne(0);
            return singletonOne;
        }
        return singletonOne;
    }

    public synchronized static SingletonOne getInstance(int n) {
        if(singletonOne == null) {
            singletonOne = new SingletonOne(n);
            return singletonOne;
        }
        return singletonOne;
    }

    public synchronized int getField() {
        return field1;
    }
}
