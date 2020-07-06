package RunPkg;

import java.util.ArrayList;
import java.util.List;

import daoPkg.Connect;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		String emailCaptura = "eron.palmeiras@gmail.com";
		String emailpara = "correia.jessicasoares@gmail.com";
		
		MailApp email = new MailApp();
		
		email.Autentica();
		
		email.MontaMensagem(emailCaptura, emailpara, "teste");
		
	}

}
