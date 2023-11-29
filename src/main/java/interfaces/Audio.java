package interfaces;

public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.print(INIT_MESSAGE);
        System.out.println("Audio.turnOn");
    }
}
