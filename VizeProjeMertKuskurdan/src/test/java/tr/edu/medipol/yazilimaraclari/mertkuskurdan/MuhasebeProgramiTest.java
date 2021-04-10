package tr.edu.medipol.yazilimaraclari.mertkuskurdan;

import static org.junit.Assert.*;

import org.junit.Test;

public class MuhasebeProgramiTest {

	@Test
	public void testUcretHesapla() {
		
	
		int saatlikUcret = 25; 
		int calisilanSaat= 5;

		int sonuc = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);

		assertEquals(
			"Hatalý sonuc. Sonuc 125 olmaliydi", // Kosul saglanmazsa gosterilecek mesaj.
			 125  // Beklenen sonuc.
			,sonuc // Asil uretilen sonuc.
			);
		
	}



	@Test
	public void testClsSaatHesapla() {
		
		int saatlikUcret = 25; 
		int calisilanSaat= -10;

		int sonuc = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);

		assertEquals(
			"Hatalý girdi , calisilan saat (-) olamaz ", // Kosul saglanmazsa gosterilecek mesaj.
			 -250  // Beklenen sonuc.
			,sonuc // Asil uretilen sonuc.
			);
		
	}
	
	@Test
	public void testSaatUcrtHesapla() {
		
		int saatlikUcret = -25; 
		int calisilanSaat= 10;

		int sonuc = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);

		assertEquals(
			"Hatalý girdi , saatlik ucret (-) olamaz ", // Kosul saglanmazsa gosterilecek mesaj.
			 -250  // Beklenen sonuc.
			,sonuc // Asil uretilen sonuc.
			);

	}
}