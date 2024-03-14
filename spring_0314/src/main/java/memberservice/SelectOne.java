package memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;
import dto.MemberDto;

@Service
public class SelectOne {
	@Autowired
	private MemberDao memberDao;

	public MemberDto selectOne(int memberno) {
		return memberDao.selectOne(memberno);
	}
}
