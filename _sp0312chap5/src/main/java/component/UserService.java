package component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
// @Service도 @ComponentScan의 대상이 됨
public class UserService {
	
	@Autowired
	private Calculator calculator;

	public void cal(double a, double b) {
		double result = calculator.add(a, b);
		System.out.println(result);
	}
}
