package thread;

public class Task implements Runnable {
    @Override
    public void run() {
        // 스레드가 실행할 코드
        System.out.println("Thread 1");
    }
}
