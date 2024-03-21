package spring5.spring0321.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5.spring0321.dao.MemberDao;
import spring5.spring0321.dao.MemberDao2;
import spring5.spring0321.dto.Member2;

@Service
public class DeleteService {
	
	@Autowired
	private MemberDao2 memberDao;
	
	public void deleteService(Member2 member) {
		memberDao.delete(member);
	}
	
}
