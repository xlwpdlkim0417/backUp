package java_2024_01_10;

public class Animal {

	private String name; // private은 외부 클래스에서 접근 못하게 하는 접근제한자임
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
