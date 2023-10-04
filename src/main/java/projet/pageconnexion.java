package projet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageconnexion {
	WebDriver driver;
public pageconnexion (WebDriver driver) {
	
	
	this.driver = driver;
	
}

public void cliquerBoutonmonespace() {
    WebElement Btnmonespace = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/form/div[4]/button"));
    Btnmonespace.click();  
}

public void saisirlogin(String val1) {

	WebElement champsLogin = driver.findElement(By.id("myaccount_login_email"));
    champsLogin.sendKeys(val1);
}

public void saisirMdp(String val2) {
    WebElement champsMdp = driver.findElement(By.id("myaccount_login_password"));
    champsMdp.sendKeys(val2);

}

public void cliquerBoutonconnectezvous() {
    WebElement BtnLogin = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/form/div[4]/button"));
    BtnLogin.click();
    
    
       
    
 


    
}
}
