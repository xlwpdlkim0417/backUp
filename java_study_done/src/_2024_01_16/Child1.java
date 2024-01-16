package _2024_01_16;

public class Child1 extends Parent {

	private int studentNo;

	public Child1(String name, int studentNo) { // Implicit super constructor Parent() is undefined. Must explicitly
//		super(name);	//이걸 만들던지 or...		// invoke another constructor
		this.name = name;
		this.studentNo = studentNo;
	}

}
