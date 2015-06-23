package praktikum.delapan;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CobaCheckedException1 {
	public static void main(String args[]) {
		try {
			FileInputStream file = new FileInputStream("e:/coba.txt");
			file.close();
		}catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi");
		}catch (IOException e) {
			System.out.println("IOException terjadi");
		}
	}
}
