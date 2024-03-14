package boardservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;
import dto.BoardDto;

@Service
public class BoardSelectOne {
	@Autowired
	private BoardDao boardDao;

	public BoardDto selectOne(int num, boolean hitsIncreased) {
		return boardDao.selectOne(num, hitsIncreased);
	}
}
