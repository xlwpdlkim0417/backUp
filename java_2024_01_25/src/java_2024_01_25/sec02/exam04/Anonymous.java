package sec02.exam04;

public class Anonymous {

	int field;

	void method(int arg1, int arg2) {

		int var1 = 0;
		int var2 = 0;
//		arg2 = 20;	// 파이널이라 이거 여기서 다시 정의하면 오류남
		field = 10;
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}

		};

	}

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		anony.method(0, 0);

	}

}
