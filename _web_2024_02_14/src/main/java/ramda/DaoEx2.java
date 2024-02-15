package ramda;

import java.util.List;
import dao.BoardDao;
import dto.Board;

public class DaoEx2 {

	public static void main(String[] args) {
		BoardDao dao = BoardDao.getInstance();
		List<Board> list = dao.selectList();
		// null 대신에 selectList() 호출해 보세요

		list.stream().forEach(s -> {
			// forEach는 메소드임
			// Consumer = This is a functional interface
			// 결국 Consumer 인터페이스의 forEach 단 하나 뿐인 메소드
			// s는 아래의 board처럼 매개변수임
			// 매개변수의 괄호도 생략이 가능함

			// 중간단계에서 뭔가 조작이 필요하다면 그걸 반복문에서 if문으로 조작하던걸 한 줄로 정리가 가능함

			System.out.println(s.getWriter());
		});

		// list에 들어있는 객체들을 출력해 보세요
//		for (Board board : list) {
//			System.out.println(board);
//		}
	}

}
