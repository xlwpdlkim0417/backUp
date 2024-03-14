package boardservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;
import dto.BoardDto;

@Service
public class BoardSelectList {
	@Autowired
	private BoardDao boardDao;

	public ArrayList<BoardDto> selectList(int start, int listSize) {
		return boardDao.selectList(start, listSize);
	}
}
