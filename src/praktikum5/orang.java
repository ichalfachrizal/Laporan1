package praktikum5;

public class orang {
	public static void main(String[] args) {
		orang objekorang = new orang();
		Hewan objekhewan = null;
		if (objekorang instanceof orang) {
			System.out.println("objekorang adalah instan dari kelas " + "Orang");}
		if (objekhewan == null) {
			System.out.println("objekhewan belum diinstansiasi");
		}
	}
}
class Hewan{
	
}
