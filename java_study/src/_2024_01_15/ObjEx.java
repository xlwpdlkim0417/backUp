package _2024_01_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Acc implements Serializable { // implements Serializable 파일 저장할 때 일렬로 저장되도록 만들어주는 구문
	int x;
	String y;

	@Override
	public String toString() {
		return "Acc [x=" + x + ", y=" + y + "]";
	}

}

public class ObjEx { // 이 클래스의 목적 : 객체를 파일로 저장하겠다

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Acc acc = new Acc();
		acc.x = 100;
		acc.y = "가나다";
		System.out.println(acc);

		FileOutputStream fos = new FileOutputStream("C:/temp/acc.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("C:/temp/acc.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Acc acc2 = (Acc) ois.readObject();
		System.out.println(acc2);

	}

}
