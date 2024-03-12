package anno1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
// 이거 타입이 METHOD라서 메소드에만 붙여야함
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String value() default "MyAnnotation : default value";
}