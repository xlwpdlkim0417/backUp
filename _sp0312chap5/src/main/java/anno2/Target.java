package anno2;

import anno1.MyAnnotation;

public class Target {
	
	@MyAnno(value = "연습입니다")
	@MyAnnotation
	public void sub() {
		System.out.println("Target");
	}
}
