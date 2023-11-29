package interfaces.sealed;

public non-sealed interface InterfaceB extends InterfaceA {
    void methodB();
}

// 이거나

//public sealed interface InterfaceB extends interfaceA {
//}

// 이어야 함. interface 는 final 없음
