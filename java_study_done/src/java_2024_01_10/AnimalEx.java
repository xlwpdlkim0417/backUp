package _2024_01_10;

public class AnimalEx {

	public static void main(String[] args) {

		Animal ani = new Animal();

//		ani.name = "사자";	//캡술화 위반. 직접 사용했잖음? 밥을 입으로 먹는게 아니라 위에 그냥 넣어버린 상태임
		ani.setName("사자"); // 이게 위에 ani.name이랑 다른 점이 뭔데? 아래는 메소드를 불러온 거고 위에는 필드값을 초기화한거임 나중에 public 아니고 private로 코드 짜면 필드값 초기화로 못 불러옴

	}

}
