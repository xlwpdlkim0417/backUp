package sec04.exam06;
//메소드 오버로딩

public class Calculator {

	// 정사각형의 넓이
	double areaRectangle(double width) {
		// 리턴 타입 : double
		// 매개 변수 : double width
		return width * width; // 메소드 실행 결과값 연산 후 리턴
	}

	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		// 리턴 타입 : double
		// 매개 변수 : double width, double height
		return width * height; // 메소드 실행 결과값 연산 후 리턴
	}

}
