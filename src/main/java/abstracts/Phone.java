package abstracts;

public abstract class Phone {
    // 추상 클래스는 공통 필드 작성 가능
    String owner;

    Phone(final String owner) {
        this.owner = owner;
    }

    abstract void category();

    // 추상 클래스는 메서드 직접 구현 가능
    void turnOn() {
        System.out.println("Phone.turnOn");
    }

    void turnOff() {
        System.out.println("Phone.turnOff");
    }
}
