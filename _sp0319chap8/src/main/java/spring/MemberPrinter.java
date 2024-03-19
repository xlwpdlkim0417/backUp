package spring;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrinter {
	private DateTimeFormatter dateTimeFormatter;

	public MemberPrinter() {
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
//		생성자에서 필드값 초기화
	}

	public void print(Member member) {
		System.out.println("dateTimeFormatter 객체: " + dateTimeFormatter);
		if (dateTimeFormatter == null) {
			System.out.printf("회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n", member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		} else {
			System.out.printf("회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%s\n", member.getId(), member.getEmail(),
					member.getName(), dateTimeFormatter.format(member.getRegisterDateTime()));
		}
	}

//	@Autowired(required = false)
////	이걸 사용하면 주입할 (@Bean)이 등록되어 있는지 아닌지 확인하는 과정이 들어감 (일치하는 빈이 없으면 값 할당 자체를 하지 않음)	
////	@Autowired
//	public void setDateFormatter(
////			@Nullable
////			@Autowired와 함께 사용하는 @Nullable (일치하는 빈이 없을 떄 null 값을 할당)
//			DateTimeFormatter dateTimeFormatter) {
////		이거 @Autowired 넣으면 아래와 같은 오류가 발생함
////		Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'java.time.format.DateTimeFormatter' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
////		@Autowired를 쓸 필요는 없는데 써야 하는 상황이라고 가정하면 반드시 의존주입이 발생했어야 한다는 말임
////		그런 상황에서 (required = false) 조건을 사용할 수 있는 거임
//		this.dateTimeFormatter = dateTimeFormatter;
//	}

	@Autowired
	public void setDateFormatter(Optional<DateTimeFormatter> formatterOpt) {
//		Optional은 NPE 없애기 위해서 나온 친구입니다
//		매칭되는 빈이 없으면 값이 없는 Optional을 할당
		if (formatterOpt.isPresent()) {
//			.isPresent() = 비어있지 않다면
			this.dateTimeFormatter = formatterOpt.get();
		} else {
			this.dateTimeFormatter = null;
		}
	}

}
