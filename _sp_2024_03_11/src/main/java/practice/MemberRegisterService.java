package practice;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	
	@Autowired
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
//		@Autowired는 세터 메소드에 주던가, 필드에 주던가 둘 중 하나만 주자
		this.memberDao = memberDao;
	}

	public void regist() {
		memberDao.process();
//		if (memberDao == null) {
//			System.out.println("memberDao가 null입니다");
//		}
		System.out.println("regist()");
	}
}
