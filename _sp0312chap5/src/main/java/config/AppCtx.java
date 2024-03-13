package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberSummaryPrinter;
import spring.VersionPrinter;
import spring2.MemberRegisterService;

@Configuration
@ComponentScan(basePackages = { "spring",
		"spring2" }, excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = { NoProduct.class,
				ManualBean.class }))
//@ComponentScan(basePackages = {
//		"spring" }, excludeFilters = @Filter(type = FilterType.REGEX, pattern = "spring\\..*Service"))
// 동일 패키지 내의 파일이면 @ComponentScan 뒤에 아무것도 안써도 괜찮음
// 경로가 복잡해지면 그것까지 다 써줘야 함
public class AppCtx {

//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();
//	}

//	@Bean
//	public MemberRegisterService memberRegSvc() {
//		return new MemberRegisterService();
//	}

//	@Bean
//	public ChangePasswordService changePwdSvc() {
//		return new ChangePasswordService();
//	}

//	@Bean
//	@Qualifier("printer")
//	public MemberPrinter memberPrinter() {
//		return new MemberPrinter();
//	}

	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}

//	@Bean
//	public MemberPrinter memberPrinter2() {
//		return new MemberPrinter();
//	}

//	@Bean은 타입으로 이름을 따지기 때문에 @Qualifier로 우선 순위를 준다고 보면됨

	@Bean
	@Qualifier("summaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}

//	@Bean
//	public MemberListPrinter listPrinter() {
//		return new MemberListPrinter();
//	}

//	@Bean
//	public MemberInfoPrinter infoPrinter() {
//		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//		infoPrinter.setPrinter(memberPrinter2());
////		SETTER 메소드 만들고 memberPrinter2() DI하면 LIST가 나올까 INFO가 나올까?
////		설정 클래스에서 세터 메소드를 통해 의존을 주입해도 해당 세터 메소드에 @Autowired 애노테이션이 붙어있으면 자동 주입을 통해 일치하는 빈을 주입
//		return infoPrinter;
//	}

//	@Bean
//	public VersionPrinter versionPrinter() {
//		VersionPrinter versionPrinter = new VersionPrinter();
//		versionPrinter.setMajorVersion(5);
//		versionPrinter.setMinorVersion(0);
//		return versionPrinter;
//	}
}
