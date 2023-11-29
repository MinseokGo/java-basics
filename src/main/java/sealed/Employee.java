package sealed;

public final class Employee extends Person {
    @Override
    void work() {
        System.out.println("Employee.work");
    }
}
