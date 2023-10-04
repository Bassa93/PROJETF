package commun;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Pagecommun {
	
	
	 public static WebDriver driver;
	    @Before
	    public void initDriver(){
	        driver = new ChromeDriver();
	        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://www.c-and-a.com/fr/fr/shop");
	    }
	    @After
	    public void closeDriver(){
	    driver.close();

	    }
	
}
