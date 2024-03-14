package boardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;
import dto.BoardDto;

@Service
public class BoardInsertOne {
	@Autowired
	private BoardDao boardDao;

	public void insertOne(BoardDto dto) {
		boardDao.insertOne(dto);
	}
}
