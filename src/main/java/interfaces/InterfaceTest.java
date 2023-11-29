package interfaces;

public class InterfaceTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new Television();
        remoteControl.turnOn();

        remoteControl = new Audio();
        remoteControl.turnOn();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.naver.com");
    }
}
