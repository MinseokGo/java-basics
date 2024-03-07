package thread.beep;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread current = Thread.currentThread();
        System.out.println("current = " + current);
        Thread beepThread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                System.out.println(getName());
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) { }
                }
            }
        };
        beepThread.setName("Beep Thread");
        beepThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }

        Thread workerThread = new WorkerThread();
        workerThread.setName("Worker Thread");
        workerThread.start();
        current = Thread.currentThread();
        System.out.println("current = " + current);

        Thread thread = new Thread() {
            @Override
            public void run() {
                // 스레드가 실행할 코드
                System.out.println(getName());
                System.out.println("Anonymous Object Thread");
            }
        };
        thread.setName("Thread");
        thread.start();
        current = Thread.currentThread();
        System.out.println("current = " + current);
    }
}
