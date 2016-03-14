package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void first() {
	  
	  
	 // System.setProperty("webdriver.chrome.driver", "")
 WebDriver driver=new FirefoxDriver();
 driver.get("https://www.manipalhospitals.com/");
  driver.manage().window().maximize();
  WebElement ele = driver.findElement(By.xpath(".//*[@id='icon']/li[1]/a"));
  ele.click();
  
  driver.close();
  
  }
}
