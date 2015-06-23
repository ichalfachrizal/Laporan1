package praktikum.enam.mobil;
import praktikum.enam.utama.Mobil2;

public class Sedan extends Mobil2 {
	public String nama;
	public Sedan(){
		super();
	}
	public Sedan (String nama){
		super(nama);
	}
	public void cetak(String nama){
		super.nama=nama;
		this.nama="sedan lokal";
		System.out.println(nama);
		System.out.println(this.nama);
	}
	public static void main(String args[]){
		Sedan sedan = new Sedan();
		sedan.cetak("Sedan");
	}
	public void stater(){
		System.out.println("stater sedan");
	}
}
