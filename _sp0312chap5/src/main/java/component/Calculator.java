package component;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
//	DAO 같은 애

	public Double add(double x, double y) {
//		더하기
		return x + y;
	}
}