package memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;
import dto.MemberDto;

@Service
public class SelectMember {
	@Autowired
	private MemberDao memberDao;

	public MemberDto selectMember(String id, String pw) {
		return memberDao.selectMember(id, pw);
	}
}
