package interfaces.multiInterface;

public class MultiInterfaceTest {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA interfaceA = impl;
        interfaceA.methodA();
        //interfaceA.methodB();
        //interfaceA.methodC();
        System.out.println();

        InterfaceB interfaceB = impl;
        interfaceB.methodB();
        //interfaceA.methodA();
        //interfaceA.methodC();
        System.out.println();

        InterfaceC interfaceC = impl;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}
