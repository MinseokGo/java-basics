package thread;

public class SumThread extends Thread {
    private long sum;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}
