	package java_2024_01_15;
	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	
	public class ObjEx2 {
	
		public static void main(String[] args) throws IOException, ClassNotFoundException {
	
			FileInputStream fis = new FileInputStream("C:/temp/acc.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Acc acc2 = (Acc) ois.readObject();
			System.out.println(acc2);
	
		}
	
	}