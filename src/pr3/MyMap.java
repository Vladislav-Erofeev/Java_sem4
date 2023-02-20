package pr3;

import java.util.Map;
import java.util.concurrent.Semaphore;

public class MyMap {
    private volatile Map<String, Integer> map;
    private static final Semaphore semaphore = new Semaphore(1);

    public MyMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Integer get(String key) {
        Integer n = 0;
        try {
            semaphore.acquire();
             n = map.get(key);
            semaphore.release();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        return n;
    }

    public void set(String key, Integer value) {
        try {
            semaphore.acquire();
            map.put(key, value);
            semaphore.release();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }

    public void incr(String key) {
        try {
            semaphore.acquire();
            map.put(key, map.get(key) + 1);
            semaphore.release();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
