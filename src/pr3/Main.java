package pr3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static volatile MyList myList;
    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        myList = new MyList(list);
//        Thread thread1 = new Thread( ()->{
//            for(int i = 0; i < 5000; i++)
//                myList.incrFirst();
//        });
//
//        Thread thread2 = new Thread(()->{
//            for(int i = 0; i < 5000; i++)
//                myList.incrFirst();
//        });
//
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (Exception e) {}
//        System.out.println(myList.getFirst());


        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        String[] keys = {"One", "Two", "Three"};
        Random random = new Random();
        MyMap myMap = new MyMap(map);

        Thread thread11 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                int n = 2;
                myMap.incr(keys[n]);
            }
        });

        Thread thread21 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                int n = 2;
                myMap.incr(keys[n]);
            }
        });

        thread11.start();
        thread21.start();

        for(Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
