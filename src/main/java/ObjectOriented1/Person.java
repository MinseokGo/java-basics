package ObjectOriented1;

public class Person {
    private final String name;
    private final int age;

    public Person(final String name) {
        this(name, 0);
    }

    public Person(final int age) {
        this(age, "default");
    }

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Person(final int age, final String name) {
        this.name = name;
        this.age = age;
    }
}
