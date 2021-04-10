package tr.edu.medipol.yazilimaraclari.mertkuskurdan;

import org.apache.commons.text.*;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		System.out.println(ucretHesapla(5,25));
		} 

	public static int ucretHesapla(int calisilanSaat, int saatlikUcret) {
		
		return calisilanSaat*saatlikUcret;
	}
	

	
}




