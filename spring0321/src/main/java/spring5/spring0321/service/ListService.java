package spring5.spring0321.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5.spring0321.dao.MemberDao2;
import spring5.spring0321.dto.Member2;

@Service
public class ListService {
	@Autowired
	private MemberDao2 memberDao;

	public List<Member2> selectAll() {
		return memberDao.selectAll();
	}
}
