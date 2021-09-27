package TestWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import onone_Web.LoginPage;

public class TestLogin extends TestBase {

	
	LoginPage log;

	@BeforeTest
	public void chromeBrowser1()
	{
		//openBrowser("chrome","https://admin.on-one.click/account/login");
		log= new LoginPage(driver);

	}
	
	@Test
	public void RunBrowser () throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
        //Create driver object 
        WebDriver driver = new ChromeDriver();
        //Navigate to a URL
        driver.get("https://admin.on-one.click/account/login");
       
    
        Thread.sleep(5000);
        driver.findElement(By.id("txtUserName")).sendKeys("ghada.mohamed@test.com");
        driver.findElement(By.id("txtPassword")).sendKeys("123456"); 		
        		
        driver.findElement(By.id("btnLogin")).click();		
        Thread.sleep(5000);
        
        driver.quit();

	}
	
	
	
	/*@Test()
	public void login1 (String UName,String Password )  
	{
		
		log.login(UName, Password);
		System.out.println( UName );
		System.out.println( Password );
	}*/
	
	
}
