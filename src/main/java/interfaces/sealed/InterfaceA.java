package interfaces.sealed;

public sealed interface InterfaceA permits InterfaceB {
    void methodA();
}
