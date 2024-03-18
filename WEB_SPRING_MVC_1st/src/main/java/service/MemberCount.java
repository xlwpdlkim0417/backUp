package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;

@Service
public class MemberCount {

	@Autowired
	private MemberDao memberDao;

	public int count() {
		return memberDao.count();
	}
}
