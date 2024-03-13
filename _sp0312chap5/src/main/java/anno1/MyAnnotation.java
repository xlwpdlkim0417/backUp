package anno1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
// 이거 타입이 METHOD라서 메소드에만 붙여야함
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String value() default "MyAnnotation : 기본값";
//	여기에 있는 value()는 main의 13번 라인에 있는 .value()와 동일하게 설정하면 됨
}