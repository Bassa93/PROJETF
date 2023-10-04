package projet;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class pagemonespace {
	WebDriver driver;
	
public pagemonespace (WebDriver driver){
	this.driver = driver;
}
	public void cliquerBoutoninscription() {
	    WebElement btnsinscrirmaintenant = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/a/span"));
	    btnsinscrirmaintenant.click();
}
	
	
	public void Adressemail(String val3) {

		WebElement champsadressemail = driver.findElement(By.id("myaccount_login_email"));
	    champsadressemail.sendKeys(val3);
	    
}
	
	
	public void cliquerBoutonsuivant() {
	    WebElement btnsuivant = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/form/button"));
	    btnsuivant.click();
}
	
	
	public void cliquerchampsmadame() {
	    WebElement btnMme = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/form/div[1]/div/label[1]/button"));
	    btnMme.click();
	
}	
	
	
	public void cliquerchampsmonsieur() {
	    WebElement btnMr = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/form/div[1]/div/label[1]/button"));
	    btnMr.click();
}
	
	
	
	
	public void cliquerchampsdivers() {
	    WebElement btnDivers = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/form/div[1]/div/label[1]/button"));
	    btnDivers.click();
	
}
	
	
	public void prenom(String val4) {

		WebElement champsprenom = driver.findElement(By.id("firstName"));
	    champsprenom.sendKeys(val4);
	
	
}
	
	public void nom(String val5) {

		WebElement champsprenom = driver.findElement(By.id("lastName"));
	    champsprenom.sendKeys(val5);
	}
	
	
	public void motdepasse(String val6) {

		WebElement champsmotdepasse = driver.findElement(By.id("password"));
	    champsmotdepasse.sendKeys(val6);
	
	}
	
	
	public void cocherlechamps() {
	    WebElement btncocherlechamps = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/form/label/div"));
	    btncocherlechamps.click();
	}
	
	
	public void cliquedevenirmembre() {
	    WebElement btndevenirmenbre = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/form/label/div"));
	    btndevenirmenbre.click();
	
	}
	
//	public void pagefidelité() {
    //    WebElement msgfidelité = driver.findElement(By.xpath("/html/body/div[1]/div[4]/section/section/div/div[1]/div"));
     //   Assert.assertTrue(msgfidelité.isDisplayed());
	
//	}
}

