package praktikum.delapan;
import java.io.IOException;
public class CobaThrow1 {
	public static void cobaMetode() throws IOException{
		throw new IOException();
	}
	public static void cobaMetodeDua() throws IOException{
		try{
			cobaMetode();
		}catch (IOException e) {
			throw e;
		}
	}
	public static void CobaMetodeTiga(){
		throw new IndexOutOfBoundsException();
	}
	public static void main(String args[]){
		try{
			cobaMetodeDua();
		}catch (IOException e) {
			System.out.println("IOException terjadi");
		}
	}
}
