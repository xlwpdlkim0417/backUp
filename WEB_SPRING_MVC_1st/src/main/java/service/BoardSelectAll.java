package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;
import dto.Board;


@Service
public class BoardSelectAll {
	@Autowired
	private BoardDao boardDao;
	
	public List<Board> selectAll(){
		return boardDao.selectAll();
	}
}
