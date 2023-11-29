package car;

public class DefaultTire implements Tire {
    @Override
    public void roll() {
        System.out.println("DefaultTire.roll");
    }
}
