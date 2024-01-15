package _2024_01_15;

public class StudentService {

	Student student = new Student();

	private static StudentService studentService = new StudentService();

	private StudentService() {

	}

	public static StudentService getInstace() { // getInstance아니고 다른 이름이어도 괜찮은데 통상적으로 이 단어를 씀
		return studentService;
	}

}
