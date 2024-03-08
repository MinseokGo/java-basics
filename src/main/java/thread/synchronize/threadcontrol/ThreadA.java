package thread.synchronize.threadcontrol;

public class ThreadA extends Thread {
    private final WorkObject workObject;

    public ThreadA(final WorkObject workObject) {
        setName("ThreadA");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        workObject.methodA();
    }
}
