package laporan1;

public class biodataperhitungan {
	static String nama = "fachrizal";/* deklarasi variabel, string disini sebagai variabel global 
	yang dapat digunakan disemua class*/
	
	
	public static void main(String args[])
	{
		//biodata
		System.out.println(nama); 
		System.out.println("Nim     :60200112036");
		System.out.println("Kelas   :E");
		System.out.println("Jurusan :Teknik Informatika");
		System.out.println("Asal    :Makassar");
		System.out.println("Lahir   :di Ujung Pandang, 05 April 1994");
		System.out.println("Hobi    :Futsal");
		//aritmatika
		System.out.println(jumlah(2,2));
		System.out.println(kurang(2,2));
		System.out.println(kali(2,2));
		System.out.println(bagi(2,2));
		
	}
	
	static int jumlah(int a, int b){
		return a+b; 
	}
	
	static int kurang(int a, int b){
		return a-b;
	}
	
	static int kali(int a, int b){
		return a*b;
	}
	
	static float bagi(int a, int b){
		return a/b;
	}
}
