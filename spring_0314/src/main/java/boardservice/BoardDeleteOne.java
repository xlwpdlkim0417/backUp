package boardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;

@Service
public class BoardDeleteOne {
	@Autowired
	private BoardDao boardDao;

	public void deleteOne(int num) {
		boardDao.deleteOne(num);
	}
}
