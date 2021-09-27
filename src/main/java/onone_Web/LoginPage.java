package onone_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends PageBase {
	

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	public void Result() {
		// TODO Auto-generated method stub
		
	}
	
	//Required Elements
	
	@FindBy(id = "txtUserName")
	WebElement UserName;
	
	@FindBy(id = "txtPassword")
	WebElement pass;
	
	@FindBy(id = "btnLogin")
	WebElement button;
	
	
	public void login (String UName,String Password ) 
	{
		UserName.sendKeys(UName);
		pass.sendKeys(Password);
		
		button.click();
	}


		
	/*	@Test
		public void RunBrowser () throws InterruptedException 
		{
			WebDriverManager.chromedriver().setup();
	        //Create driver object for Chrome
	        WebDriver driver = new ChromeDriver();
	        //Navigate to a URL
	        driver.get("https://admin.on-one.click/account/login");
	        //quit the browser
	       // driver.quit();
	        Thread.sleep(5000);
	        driver.findElement(By.id("txtUserName")).sendKeys("ghada.mohamed@test.com");
	        driver.findElement(By.id("txtPassword")).sendKeys("123456"); 		
	        		
	        driver.findElement(By.id("btnLogin")).click();		
	        Thread.sleep(5000);


		}*/
		
	


}
