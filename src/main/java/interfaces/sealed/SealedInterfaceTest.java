package interfaces.sealed;

public class SealedInterfaceTest {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA interfaceA = impl;
        interfaceA.methodA();
        System.out.println();

        InterfaceB interfaceB = impl;
        interfaceB.methodA();
        interfaceB.methodB();
        System.out.println();

        InterfaceC interfaceC = impl;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}
