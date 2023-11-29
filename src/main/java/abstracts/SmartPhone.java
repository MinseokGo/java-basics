package abstracts;

public class SmartPhone extends Phone {
    SmartPhone(final String owner) {
        super(owner);
    }

    @Override
    void category() {
        System.out.println("SmartPhone.category");
    }
}
