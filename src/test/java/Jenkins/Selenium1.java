package Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium1 { 
  
	WebDriver driver; 

 @Test(priority=1) 
	public void launchbrowser()
   {
    System.setProperty("webdriver.chrome.driver", "C:/Testing/Automation/Jenkins.Practice/Drivers/chromedriver.exe");
    driver =new ChromeDriver();  
	}  

   @Test (priority=2)  
	public void test1() {
     driver.get("https://www.google.co.in/");
	}
   @Test (priority=3)
 
	public void test2() {
     driver.manage().window().maximize(); 
	}
   @Test (priority=4)  

	public void test3() { 
      driver.findElement(By.xpath("//a[contains(text(), 'About')]")).click(); 
	}
	 
	
 @Test(priority=5)   
   public void Closebrowser() {
		driver.quit(); 
	}




}
