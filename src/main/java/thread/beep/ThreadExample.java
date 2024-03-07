package thread.beep;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable task = new Task();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 스레드가 실행할 코드
                System.out.println("Thread 2");
            }
        });
        Thread thread3 = new Thread(() -> {
            // 스레드가 실행할 코드
            System.out.println("Thread 3");
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
