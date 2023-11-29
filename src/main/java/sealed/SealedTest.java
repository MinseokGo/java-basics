package sealed;

public class SealedTest {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        Manager manager = new Manager();
        ManagerIntern managerIntern = new ManagerIntern();

        polymorphism(person);
        polymorphism(employee);
        polymorphism(manager);
        polymorphism(managerIntern);
    }

    static void polymorphism(Person person) {
        person.work();
    }
}
