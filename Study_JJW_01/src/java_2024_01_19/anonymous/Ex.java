package java_2024_01_19.anonymous;

class AnyClass {

	void mmm() {

	}

}

public class Ex {

	public static void main(String[] args) {

		AnyClass ac = new AnyClass() { // 이름이 없으니까 강제형변환으로 돌아가는 걸 못함
			// ac는 부모클래스에서 정한 임의의 변수임

			// 즉시 만들 수 있고 다시 똑같은 친구를 호출할 수 없음 새로 생성해야한다는 말임
			// 여기 전용으로 사용해야 함

			@Override
			void mmm() { // 이게 정의된다는 것 자체가 자식객체라는 증거임 왜? 자기 자신을 재정의할 수는 없잖아
				super.mmm();
			}

		};

	}

}
