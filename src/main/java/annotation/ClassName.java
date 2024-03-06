package annotation;

// TYPE(클래스) 에 적용
@AnnotationName("TYPE(Class) 에 적용")
public class ClassName {
    @AnnotationName("필드에 적용")
    private String fieldName;

    // @AnnotationName("생성자에 적용")
    public ClassName() {
    }

    @AnnotationName("메서드에 적용")
    public void methodName() {
    }
}
