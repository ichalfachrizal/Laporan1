package praktikum.enam.utama;
import praktikum.enam.mobil.Sedan;
import praktikum.enam.mobil.Truk;
public class MobilTest {
	
	public static void staterMobil (Mobil2 Mobil){
		Mobil.stater();
	}
	
	public static void main(String[] args) {
		Mobil2 sedan = new Sedan();
		Truk truk = new Truk();
		staterMobil(new Mobil2());
		staterMobil(sedan);
		staterMobil(truk);
	}
}
