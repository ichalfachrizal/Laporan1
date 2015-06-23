package praktikum.enam.utama;

import praktikum.enam.rangka;

public class mobil {
	private rangka Rangka;

	public praktikum.enam.mesin Mesin;
	
	public mobil(){
		Rangka= new rangka();
		Mesin= new praktikum.enam.mesin();
	}
	public static void main(String args[]){
		new mobil();
	}
}
