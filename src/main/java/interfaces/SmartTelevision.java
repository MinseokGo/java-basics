package interfaces;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.print(INIT_MESSAGE);
        System.out.println("SmartTelevision.turnOn");
    }

    @Override
    public void search(final String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
