package memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;

@Service
public class DeleteOne {
	@Autowired
	private MemberDao memberDao;

	public void deleteOne(int memberno) {
		memberDao.deleteOne(memberno);
	}
}
