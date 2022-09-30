package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginSuccess1 {
	 WebDriver driver;
  @Test
  public void setup()
 
  {
//	  System.setProperty("webdriver.gecko.driver", "C:\\Swapna\\QA\\Software\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Swapna\\QA\\Software\\geckodriver.exe");
		 driver=new FirefoxDriver();
		PageObjectmodelLogin login=new PageObjectmodelLogin(driver);
		driver.navigate().to("http://localhost:7080/login ");
		login.username("tomsmith");
		login.password("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		//String expected title=https://www.facebook.com/;
  }
		@Test
		public void verifytitle()
		{
		String x=driver.getTitle();
		System.out.println(x);
		if (x.equals("The Internet"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		Assert.assertEquals("The Internet", x);
				}
		
		
  }

