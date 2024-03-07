package thread;

public class WorkerThread extends Thread {
    @Override
    public void run() {
        // 스레드가 실행할 코드
        System.out.println("Worker Thread");
    }
}
