package seleniumClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class HDFC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Sharath\\Selenium_Workspace\\JARS\\BrowserExes\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com");
		
		
		driver.switchTo().frame(driver.findElement(By.id("vizury-notification-template")));
	driver.findElement(By.id("div-close")).click();
		/*try{
			driver.findElement(By.id("container-div")).isDisplayed();
		}catch(Exception e){
			
		}*/
		
/*		driver.findElement(By.id("loginsubmit")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Thread.sleep(3000);
		Set<String> chidlWindow = driver.getWindowHandles();
	
		for(String a:chidlWindow){
			driver.switchTo().window(a);
		}
		
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//div[@class='impMsgs']/preceding-sibling::div/a")).click();
		
		Set<String> chidlWi = driver.getWindowHandles();
		
	    for(String a:chidlWi){
			driver.switchTo().window(a);
		}
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test");
		driver.switchTo().frame(1);
		driver.findElement(By.partialLinkText("Terms")).click();
		driver.switchTo().defaultContent();*/
	}

}
