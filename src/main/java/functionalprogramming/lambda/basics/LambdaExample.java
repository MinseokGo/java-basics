package functionalprogramming.lambda.basics;

public class LambdaExample {

    public static void main(String[] args) {
        active((x, y) -> {  // Calculable.calculate() 구현
            int result = x + y;
            System.out.println("result = " + result);
        });

        Person.action(() -> System.out.println("People is working now"));
    }

    private static void active(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}
