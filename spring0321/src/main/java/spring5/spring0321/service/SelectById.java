package spring5.spring0321.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5.spring0321.dao.MemberDao2;
import spring5.spring0321.dto.Member2;

@Service
public class SelectById {
	
	@Autowired
	private MemberDao2 memberDao;
	
	public Member2 selectById(int id) {
		return memberDao.selectById(id);
	}
}
