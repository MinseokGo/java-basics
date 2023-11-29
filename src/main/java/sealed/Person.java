package sealed;

public sealed class Person permits Employee, Manager {
    void work() {
        System.out.println("Person.work");
    }
}
