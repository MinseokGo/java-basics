package thread.synchronize.threadcontrol;

public class ThreadB extends Thread {
    private final WorkObject workObject;

    public ThreadB(final WorkObject workObject) {
        setName("ThreadB");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        workObject.methodB();
    }
}
