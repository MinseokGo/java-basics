package functionalprogramming.lambda.button;

public class Button {

    private final ClickListener clickListener;

    public Button(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @FunctionalInterface
    public static interface ClickListener {

        void onClick();
    }

    public void click() {
        clickListener.onClick();
    }
}
