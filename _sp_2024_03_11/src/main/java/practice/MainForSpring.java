package practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForSpring {

	public static void main(String[] args) {
//		MemberRegisterService mrs = new MemberRegisterService();
//		mrs.regist();
//		예전에는 이렇게 사용했었는데 지금은 공장을 돌릴 거라 형태나 메커니즘이 좀 다름

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		MemberRegisterService mrs = ctx.getBean(MemberRegisterService.class);
		mrs.regist();
//		맨 처음에 공장 돌리고 공장에 Bean 등록해뒀던 걸 가져와서 쓰는 거임

//		반드시 닫아둬야되는 건 아니지만 일단 그래도 습관을 들이자

		ChangePasswordService cps = ctx.getBean(ChangePasswordService.class);
		cps.changePassword();

		ctx.close();

	}

}
