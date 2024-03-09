package collection.set;

public class Member {
    private final String name;
    private final int age;

    public Member(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // equals 재정의
    @Override
    public boolean equals(final Object object) {
        if (object instanceof Member target) {
            return target.name.equals(name) &&
                    target.age == age;
        } else {
            return false;
        }
    }
}
