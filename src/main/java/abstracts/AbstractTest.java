package abstracts;

public class AbstractTest {
    public static void main(String[] args) {
//        SmartPhone smartPhone = new SmartPhone("go");
//        smartPhone.turnOn();
//        smartPhone.category();
//        smartPhone.turnOff();
//
//        FolderPhone folderPhone = new FolderPhone("kim");
//        folderPhone.turnOn();
//        folderPhone.category();
//        folderPhone.turnOff();

        // turnOn, category, turnOff 가 중복됨
        // 다형성을 이용
        SmartPhone smartPhone = new SmartPhone("go");
        FolderPhone folderPhone = new FolderPhone("kim");

        polymorphism(smartPhone);
        polymorphism(folderPhone);
    }

    static void polymorphism(final Phone phone) {
        phone.turnOn();
        phone.category();
        phone.turnOff();
        System.out.println();
    }
}
