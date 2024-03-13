package anno2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

//		Target ta = new Target();
//		ta.sub();

//		아래의 코드 4줄과 위의 코드 2줄이 같은 의미입니다
//		위는 명시적으로 얘기한거고 아래는 그보다는 생산성이 높습니다 왜냐고?
//		아래는 클래스 이름만 바꾸면 어디서나 사용할 수 있기 때문이지
//		jar 파일 등으로 첨부해서 꼭 소스코드 형태로 가지고 있지 않아도 사용 가능함

		String className = "anno2.Target";
		Class<?> cls = Class.forName(className);
		Target a = (Target) cls.getDeclaredConstructor().newInstance();
		a.sub();

		Method[] methods = cls.getDeclaredMethods();

		for (int i = 0; i < methods.length; i++) {
			if (methods[i].isAnnotationPresent(MyAnno.class)) {
				MyAnno myAnno = methods[i].getAnnotation(MyAnno.class);
				System.out.println(myAnno.value());
			}
			
			
		}

////		특정 메소드의 어노테이션을 가져올 수 있습니다
//		Method method = Target.class.getMethod("sub");
////		이건 이름으로 하나를 찾는 거 anno1 패키지의 main.java에 보면 getDeclaredMethods()가 있음
//		Annotation[] annotations = method.getDeclaredAnnotations();
//
//		for (Annotation anno : annotations) {
//			MyAnno myAnno = (MyAnno) anno;
//			System.out.println(myAnno.value());
//		}
	}

}
