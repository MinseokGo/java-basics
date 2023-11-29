package car;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.make();

        car.run();
    }
}
