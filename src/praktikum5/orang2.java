package praktikum5;

public class orang2 {

public String nama;
public String alamat;
public int tinggiBadan;
public float beratBadan;

public void cetakOrang() {
	System.out.println(nama + "," + alamat + "," + tinggiBadan + "," + beratBadan);
}
public static void main(String[] args) {
	orang2 objekOrang = new orang2();
	objekOrang.nama = "Fachrizal";
	objekOrang.alamat = "Makassar";
	objekOrang.tinggiBadan = 170;
	objekOrang.beratBadan = 60.4f;
	objekOrang.cetakOrang();
	
	orang2 objekOrangDua = new orang2();
	objekOrangDua.nama = "Fabregas";
	objekOrangDua.alamat = "Catalonia";
	objekOrangDua.tinggiBadan = 180;
	objekOrangDua.beratBadan = 80.9f;
	objekOrangDua.cetakOrang();
}
}
