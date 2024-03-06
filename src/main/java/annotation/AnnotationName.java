package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 적용 대상
// 타입(클래스, 인터페이스, 열거 타입), 필드, 메서드 적용
// 이외에도 생성자 로컬 변수, 패키지, 어노테이션 등에 적용 가능
@Target( { ElementType.TYPE, ElementType.FIELD, ElementType.METHOD } )
// SOURCE : 컴파일 시점에 적용되고 컴파일된 후 제거
// CLASS : 메모리 로딩 때 적용되고 메모리로 로딩된 후 제거
// RUNTIME : 실행할 때 적용되고 계속 유지됨(런타임 동안)
@Retention( RetentionPolicy.RUNTIME )
public @interface AnnotationName {
    String value();
}
