package memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;
import dto.MemberDto;

@Service
public class InsertOne {
	@Autowired
	private MemberDao memberDao;

	public void insertOne(MemberDto dto) {
		memberDao.insertOne(dto);
	}
}
