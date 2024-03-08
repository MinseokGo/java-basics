package thread.synchronize.safestop;

public class SafeStopExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        printThread.interrupt();
    }
}
