package interfaces;

public interface RemoteControl {
    // 인터페이스에 선언된 필드는 모두 public static final 의 특성을 갖는다.
    // 컴파일 과정에서 자동으로 붙는다.
    String INIT_MESSAGE = "RemoteControl.";

    // public abstract 를 붙이지 않아도 컴파일 과정에서 자동으로 붙는다.
    void turnOn();
}
