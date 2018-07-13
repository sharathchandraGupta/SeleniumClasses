package seleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassForWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path= "D:\\Sharath\\Selenium_Workspace\\JARS\\BrowserExes\\chromedriver.exe";
		System.setProperty ("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver(); 
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		 explicit wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("sdfds"))));
		
		
		

	}

}
