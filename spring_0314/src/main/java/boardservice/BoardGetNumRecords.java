package boardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;

@Service
public class BoardGetNumRecords {
	@Autowired
	private BoardDao boardDao;

	public int getNumRecords() {
		return boardDao.getNumRecords();
	}

}
