package car;

import java.util.List;

public class Car {
    private final List<Tire> tires;

    public Car(final List<Tire> tires) {
        if (tires.size() > 4) {
            throw new IllegalArgumentException();
        }
        this.tires = tires;
    }

    public void run() {
        tires.forEach(Tire::roll);
    }
}
