package functionalprogramming.lambda;

public class ReturnLambdaExample {

    public static void main(String[] args) {
        double result = active(Double::sum);
        System.out.println("result = " + result);
    }

    private static double active(Calculable calculable) {
        double x = 10;
        double y = 4;
        return calculable.calculate(x, y);
    }
}
