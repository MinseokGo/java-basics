package car;

import java.util.List;

public class CarFactory {
    public Car make() {
        NormalTire normalTire = new NormalTire();
        SpecialTire specialTire = new SpecialTire();
        List<Tire> tires = List.of(normalTire, normalTire, specialTire, specialTire);
        return new Car(tires);
    }
}
