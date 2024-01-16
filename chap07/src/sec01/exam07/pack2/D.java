package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	public D() {	//이거 생성자임 왜? 메소드라면 리턴이나 void가 붙어야함
		super();
		this.field = "value";
		this.method();
	}

}
