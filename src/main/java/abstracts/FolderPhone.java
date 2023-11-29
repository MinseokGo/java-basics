package abstracts;

public class FolderPhone extends Phone {
    FolderPhone(final String owner) {
        super(owner);
    }

    @Override
    void category() {
        System.out.println("FolderPhone.category");
    }

    @Override
    void turnOn() {
        System.out.println("FolderPhone.turnOn");
    }

    @Override
    void turnOff() {
        System.out.println("FolderPhone.turnOff");
    }
}
