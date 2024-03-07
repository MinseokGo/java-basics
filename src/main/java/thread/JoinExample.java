package thread;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sum = new SumThread();
        sum.start();

        try {
            // sum 스레드가 끝날 때까지 기다림
            sum.join();
        } catch (InterruptedException e) { }
        System.out.println(sum.getSum());
    }
}
