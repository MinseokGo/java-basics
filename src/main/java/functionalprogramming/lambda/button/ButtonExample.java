package functionalprogramming.lambda.button;

public class ButtonExample {

    public static void main(String[] args) {
        Button button = new Button(() -> System.out.println("버튼 클릭"));
        button.click();
    }
}
