package collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> elements = new Hashtable<>();

        Thread threadA = new Thread(() -> {
            System.out.println("ThreadA 시작");
            for (int i = 1; i <= 1000; i++) {
                elements.put(String.valueOf(i), i);
            }
            System.out.println("ThreadA 종료");
        });

        Thread threadB = new Thread(() -> {
            System.out.println("ThreadB 시작");
            for (int i = 1001; i <= 2000; i++) {
                elements.put(String.valueOf(i), i);
            }
            System.out.println("ThreadB 종료");
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception ignored) { }

        final int size = elements.size();
        System.out.println("size = " + size);
    }
}
