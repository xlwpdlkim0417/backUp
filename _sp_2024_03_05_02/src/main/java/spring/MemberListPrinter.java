package spring;

import java.util.Collection;

public class MemberListPrinter {
//	이거 사실상 서비스임
//	그럼에도 불구하고 굳이 나눠져있는 이유는 의존성 주입을 시각적으로 확인하라는 거임

	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
//		생성자 주입 방식으로 만들었음
		this.memberDao = memberDao;
		this.printer = printer;
	}

	public void pirntAll() {
		Collection<Member> members = memberDao.selectAll();
//		해시맵 정보를 받아서 스트림으로 반복문을 돌림
//		members.forEach(m -> printer.print(m));
		for (Member member : members) {
			printer.print(member);
		}
	}

}
