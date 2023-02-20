package pr3;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyList {
    private static final Lock lock = new ReentrantLock();
    private volatile List<Integer> list;

    public MyList(List<Integer> list) {
        this.list = list;
    }

    public void incrFirst() {
        lock.lock();
        list.set(0, list.get(0) + 1);
        lock.unlock();
    }

    public Integer getFirst() {
        return list.get(0);
    }
}