package memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;

@Service
public class GetNumRecords {
	@Autowired
	private MemberDao memberDao;

	public int getNumRecords() {
		return memberDao.getNumRecords();
	}

}
