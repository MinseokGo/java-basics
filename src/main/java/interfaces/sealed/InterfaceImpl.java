package interfaces.sealed;

public class InterfaceImpl implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("InterfaceImpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceImpl.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceImpl.methodC");
    }
}
