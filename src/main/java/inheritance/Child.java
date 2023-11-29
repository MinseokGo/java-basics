package inheritance;

public class Child extends Parent {
    private final int sequence;

    public Child(final String name, final int age) {
        super(name, age);
        this.sequence = 1;
    }

    public int getSequence() {
        return sequence;
    }
}
