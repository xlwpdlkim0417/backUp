package java_2024_01_26.sec01.exam08;

class Car {

}

public class ClassEx {

	public static void main(String[] args) throws ClassNotFoundException {

		// 클래스 정보 가져다 쓰기 01 메타데이터 가져온 거임

		Class clazz = Car.class;
		// 이거 Car.class 자체가 _dev\java\프로젝트\bin\패키지\Car.class 파일이랑 동일
		// 그걸 변수에 저장한 것

		String str = clazz.getResource("photo2.jpg").getPath();
		System.out.println(str);
		String str2 = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(str2);

		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());

		// 클래스 정보 가져다 쓰기 02 문자열 통해서 클래스 정보 가져옴

		Class clazz2 = Class.forName("sec01.exam08.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());

		// 클래스 정보 가져다 쓰기 03 만들어 쓰기 생성된 객체에서 getcalss() 사용
		Car car = new Car();
		Class clazz3 = car.getClass();
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());

	}

}
