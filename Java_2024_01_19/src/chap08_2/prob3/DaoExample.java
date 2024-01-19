package chap08_2.prob3;

interface DataAccessObject {

//	void select();
//
//	void insert();
//
//	void update();
//
//	void delete();

	String select();
}

class MySqlDao implements DataAccessObject {

	@Override
	public String select() {
		return "MySql DB에서 검색";
	}

//	@Override
//	public void select() {
//		System.out.println("MySql DB에서 검색");
//	}
//
//	@Override
//	public void insert() {
//		System.out.println("MySql DB에 삽입");
//	}
//
//	@Override
//	public void update() {
//		System.out.println("MySql DB를 수정");
//	}
//
//	@Override
//	public void delete() {
//		System.out.println("MySql DB에서 삭제");
//	}

}

class OracleDao implements DataAccessObject {

	@Override
	public String select() {
		return "Oracle DB에서 검색";
	}

//	@Override
//	public void select() {
//		System.out.println("Oracle DB에서 검색");
//	}
//
//	@Override
//	public void insert() {
//		System.out.println("Oracle DB에 삽입");
//	}
//
//	@Override
//	public void update() {
//		System.out.println("Oracle DB를 수정");
//	}
//
//	@Override
//	public void delete() {
//		System.out.println("Oracle DB에서 삭제");
//	}

}

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select(); // System.out.println(dao.select()); 이렇게는 가능한데 기본적으로는 프린트문이 없으니까 안되네
//		dao.insert();
//		dao.update();
//		dao.delete();
	}

	public static void main(String[] args) {

		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
