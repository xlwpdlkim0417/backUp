package sec01.exam02;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) { // 매개 변수의 다형성(Object로부터 상속)
		if (obj instanceof Key) { // Key 클래스의 객체 인가?
			Key compareKey = (Key) obj; // Key 클래스 변수에 대입
			if (this.number == compareKey.number) { // number 비교하려고
				// 이거 참조 타입이 아니고 프리미티브 타입이기 때문에 == 쓴거임
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}

}
