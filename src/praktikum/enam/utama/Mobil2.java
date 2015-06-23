package praktikum.enam.utama;
import praktikum.enam.rangka;
public class Mobil2 {
	public rangka Rangka;
	public praktikum.enam.mesin Mesin;
	private int nomer;
	protected String nama;
	
	public Mobil2() {
		Rangka=new rangka();
		Mesin=new praktikum.enam.mesin();
		System.out.println("konstruktor mobil");
	}
	public void stater(){
		System.out.println("stater mobil");
	}
	public Mobil2(String nama){
		this.nama=nama;
	}
}
