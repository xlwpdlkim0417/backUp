package sec01.exam01;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

//	@Override
//	public boolean equals(Object obj) { // 매개 변수 다형성
//		if (obj instanceof Member) { // Member 클래스로 객체 생성 된거니?
//			Member member = (Member) obj; // 강제 형변환 왜? ▽
////			if (id.equalsIgnoreCase(member.id)) { // 대소문자 가리지 않고
//
//			if (id.equals(member.id)) { // 문자열 비교하려고
//
//				return true;
//			}
//		}
//		return false;
//	}

	@Override
	public String toString() {
		return "member 객체 [" + id + "]";
	}

	@Override
	public int hashCode() {
		return id.toLowerCase().hashCode(); // toLowerCase() 추가하면 대문자도 같다고 말할 수 있게 됨
	}

}
// 집합에 중복되는 거 제거하고 하나만 남기듯이 이걸 시스템적으로 구현한게 위에 처리 과정이고
// 내가 생각했던 부분은 일단 만들고 나중에 검사해보는 목적이기 때문에
// 설계 과정에서 의도가 다른 거라고 보면됨
// 나중에 해시맵 배우면 좀 더 그 의도의 차이를 분명하게 알 수 있을 거임