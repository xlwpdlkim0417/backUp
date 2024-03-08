package autoEx;

import org.springframework.beans.factory.annotation.Autowired;

public class Tire {
//	일반적으로 이런 걸 POJO라고 함
	private String position;

	public void roll() {
		System.out.println(position + ", ");
		System.out.println("바퀴가 돈다.");
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
