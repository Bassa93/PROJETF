package projet;

import commun.Pagecommun;

public class testconnexion extends Pagecommun {
	public void test01() {
		pageconnexion p =new pageconnexion(driver);
		
		p.cliquerBoutonmonespace();
		
		String val1="hannachi.basmas93@gmail.com";
		p.saisirlogin(val1);
		
		String val2="AZerty123/";
		p.saisirMdp(val2);
		
		p.cliquerBoutonconnectezvous();
				
	}
}
