package praktikum5;

public class binatang {
	
public static int JUMLAH_BINATANG = 0;
public String Spesies;

public static void tambahbinatang () {
	JUMLAH_BINATANG++;
}

public static void main(String args[]) {
	binatang objekbinatang = new binatang();
	objekbinatang.Spesies = "Kucing";
	binatang.tambahbinatang();
	System.out.println(binatang.JUMLAH_BINATANG);
	
	binatang objekbinatangdua = new binatang();
	objekbinatangdua.Spesies = "Anjing";
	binatang.tambahbinatang();
	System.out.println(binatang.JUMLAH_BINATANG);
	
	System.out.println(JUMLAH_BINATANG);
	System.out.println(JUMLAH_BINATANG);
}
}
