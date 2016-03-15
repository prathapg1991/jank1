package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void first() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\QC SQL AND SELENIUM JARS\\selenium jar\\chromedriver.exe");
	  
 WebDriver driver=new ChromeDriver();
	  
//	  System.setProperty("webdriver.ie.driver", "D:\\QC SQL AND SELENIUM JARS\\selenium jar\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		
	  
	  
	  
 driver.get("https://www.manipalhospitals.com/");
  driver.manage().window().maximize();
  WebElement ele = driver.findElement(By.xpath(".//*[@id='icon']/li[1]/a"));
  ele.click();
  driver.quit();
  }


}
