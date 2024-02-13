package java_2024_01_16;

import java.util.ArrayList;
import java.util.List;

class Student2 {
	String name;
	int kor;

	public Student2(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", kor=" + kor + "]";
	}

}

public class ArrayListEx {

	public static void main(String[] args) {
		String[] strArr = new String[100]; // 이거랑 아래랑 똑같은 형식이라고 보면 되는데 위는 갯수 100으로 고정이고 아래는 무한히 만들어낼 수 있음 위는 고정형 배열, 아래는
											// 가변적인 배열

		ArrayList<Student2> slist = new ArrayList<Student2>();
		slist.add(new Student2("홍길동", 90)); // 이거 int kor; 넣었더니 뒤에 , int값 넣어주어야함
		slist.add(new Student2("홍길은", 94));
		slist.add(new Student2("홍길금", 97));

		for (Student2 stu : slist) {
			System.out.println(stu);
		}

		ArrayList<String> alist = new ArrayList<String>();
		// '어레이리스트'라고 읽음. 문자열을 가변적인 배열로 만듦.
		List<String> list = new ArrayList<>(); // 뒤의 <> 내부 내용은 생략 가능 변수가 다른데 이게 성립하는 이유는 List가 ArratList의 조상이기 때문임 이게
												// List 컬렉션이라는게 있음 캡쳐해둠 확인 ㄱ

		list.add("홍길동");
		list.add("김하나");
		list.add("김두울");

		for (String str : list) {
			System.out.println(str);
		}

		list.set(1, "박하나");
		for (String str : list) {
			System.out.println(str);
		}

	}

}
