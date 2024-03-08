package thread.synchronize;

public class User1Thread extends Thread {
    private final Calculator calculator;

    public User1Thread(final Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}
