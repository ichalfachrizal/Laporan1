package praktikum.enam.mobil;
import praktikum.enam.mesin;
import praktikum.enam.rangka;
import praktikum.enam.utama.Mobil2;
public class Truk extends Mobil2 {
	public Truk(){
	}
	public void tongkang() {
		
		Mesin = new mesin();
		stater();
		nama = "Truk";
		System.out.println("Tongkang");
	}
	public static void main(String args[]){
		Truk truk = new Truk();
		truk.tongkang();
	}
	public void stater(){
		System.out.println("stater truk");
	}
}
