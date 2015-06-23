package praktikum.tujuh;

import praktikum.tujuh.bentuk.Bentuk;
import praktikum.tujuh.bentuk.BujurSangkar;
import praktikum.tujuh.bentuk.SegitigaSamaKaki;
import praktikum.tujuh.bentuk.SegitigaSamaSisi;
public class CobaBentuk {
	public static void cetakBangun(Bentuk b) {
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	public static void main(String args[]) {
		cetakBangun(new BujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());
	}
}
