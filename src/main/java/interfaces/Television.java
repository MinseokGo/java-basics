package interfaces;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.print(INIT_MESSAGE);
        System.out.println("Television.turnOn");
    }
}
