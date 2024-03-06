package generic;

// 결정되지 않은 타입을 파라미터로 처리하고
// 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능
public class GenericBox<T> {
    public T content;

    public boolean compare(GenericBox<T> other) {
        return content.equals(other.content);
    }

    public static <A> GenericBox<A> boxing(A type) {
        GenericBox<A> genericBox = new GenericBox<>();
        genericBox.content = type;

        return genericBox;
    }

    public static <B extends Number> boolean numberCompare(B b1, B b2) {
        return b1.equals(b2);
    }
}
