package thread.synchronize;

public class User2Thread extends Thread {
    private final Calculator calculator;

    public User2Thread(final Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }
}
