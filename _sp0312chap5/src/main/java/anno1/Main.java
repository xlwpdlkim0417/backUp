package anno1;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Method[] methodList = MyObject.class.getDeclaredMethods();
//		이건 선언된 건 전부 다 가져오는 거 anno2 패키지의 main.java에 보면 getMethod("sub")가 있는데 둘이 서로 다른거임

		for (Method method : methodList) {
			if (method.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation = method.getDeclaredAnnotation(MyAnnotation.class);
				String value = annotation.value();
				System.out.println(method.getName() + " : " + value);
			}
		}
	}
}