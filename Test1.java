package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
@Test
public void test() throws InterruptedException{
	
	WebDriver driver=new FirefoxDriver();
	 driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
	 Thread.sleep(3000);; 
	 driver.manage().window().maximize();
	  driver.findElement(By.id("loanamount")).sendKeys("1000");
	  
	  
	 // driver.close(); 
	  
	  
	  
	
	
	
	
}
}
