package sealed;

// 상속을 제한하지 않음
public non-sealed class Manager extends Person {
    @Override
    void work() {
        System.out.println("Manager.work");
    }
}

// 상속 제한
//public final class Manager extends Person {
//}

// 또 다른 봉인 클래스로써 하위 클래스를 가지고 있어야함. (sealed 와 permits 는 세트)
//public sealed class Manager extends Person permits ManagerIntern {
//}
