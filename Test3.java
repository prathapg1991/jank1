package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Test3 {
@Test
public void test() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\QC SQL AND SELENIUM JARS\\selenium jar\\chromedriver.exe");
	  
	 WebDriver driver=new ChromeDriver();
	
	System.setProperty("webdriver.ie.driver", "D:\\QC SQL AND SELENIUM JARS\\selenium jar\\IEDriverServer.exe");
	//WebDriver driver=new InternetExplorerDriver();
	
	
	driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
	 Thread.sleep(3000);
driver.close();

}
}
