package boardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;
import dto.BoardDto;

@Service
public class BoardUpdateOne {
	@Autowired
	private BoardDao boardDao;

	public void updateOne(BoardDto dto) {
		boardDao.updateOne(dto);
	}
}
