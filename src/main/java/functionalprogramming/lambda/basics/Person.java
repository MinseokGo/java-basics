package functionalprogramming.lambda.basics;

public class Person {

    private Person() {
    }

    public static void action(Workable workable) {
        workable.work();
    }
}
