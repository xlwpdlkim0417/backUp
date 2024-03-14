package memberservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;
import dto.MemberDto;

@Service
public class SelectList {
	@Autowired
	private MemberDao memberDao;

	public ArrayList<MemberDto> selectList(int start, int listSize) {
		return memberDao.selectList(start, listSize);
	}

}
