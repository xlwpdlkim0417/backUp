package memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;
import dto.MemberDto;

@Service
public class UpdateOne {
	@Autowired
	private MemberDao memberDao;

	public void updateOne(MemberDto dto) {
		memberDao.updateOne(dto);
	}
}
