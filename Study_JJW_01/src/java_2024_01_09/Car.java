	package java_2024_01_09;
	
	public class Car {
	
		String company; // 이거 변수 아니고 필드임 파란색으로 되어있는 건 객체의 성격을 띄고 있음
		String model;
		String color;
		int maxspeed;
	
		public Car() { // 이 상태면 기본 생성자(내가 안만들어도 컴파일러가 만들어주는 생성자)인데 Car 옆에 기입하는 순간 기본생성자 지원을 해주지 않음
			System.out.println("Car()");
		}
	
		public Car(String str) { // 생성자 오버로딩. 앞에 메소드 이름이 똑같은데 메소드를 사용할 수 있게 매개변수에 손대는 거.
			company = str;
		}
	
		public Car(String str, String str1) {
			company = str;
			model = str1;
		}
	
	//	public Car(String company, String model) {	// 위에 꺼랑 똑같다고 인식함 왜? 매개변수 타입이 똑같으니까 변수 상관없이
	//		super();
	//		this.company = company;
	//		this.model = model;
	//	}
	
		public Car(String company, String model, String color, int maxspeed) {
	//		super();
			this.company = company; // 생성자의 배개 변수 이름과 초기화시킬 필드 이름이 같기 때문에 이를 구분하기 위해 this.필드 형식을 사용 / 죽 this.필드 =
									// 매개변수 형식인 거임
			this.model = model;
			this.color = color;
			this.maxspeed = maxspeed;
		}
	
		@Override
		public String toString() { // 가운데 있는 String은 리턴값 타입임
			return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxspeed=" + maxspeed + "]";
		}
	
	}
