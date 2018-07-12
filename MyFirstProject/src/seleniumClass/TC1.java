package seleniumClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		//browser exe file path
		String path= "D:\\Sharath\\Selenium_Workspace\\JARS\\BrowserExes\\chromedriver.exe";
		
		// To set the path
		System.setProperty("webdriver.chrome.driver", path);		
		
		//initialization
		WebDriver d = new ChromeDriver();
		String app_URL = "http://toolsqa.com/";		
		d.get(app_URL);
		d.manage().window().maximize();		
		
		Actions act = new Actions(d);
		WebElement ele = d.findElement(By.xpath("//*[contains(text(),'DEMO SITES')]"));
		
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[contains(text(),'Basic Demo Site')]")).click();
		
		Thread.sleep(5000);
		Set<String> str = d.getWindowHandles();

		for(String s:str){
			d.switchTo().window(s);
		}
		
		System.out.println("Wait");
		Thread.sleep(10000);
		System.out.println("Waiting");
		
		
		//to scroll to the particular element or to mouse over
		WebElement ele1 = d.findElement(By.linkText("Tabs"));
		act.moveToElement(ele1).build().perform();;
		ele1.click();
		
		
		//to right click
		WebElement ele2 = d.findElement(By.linkText("Tabs"));
		act.contextClick(ele1).build().perform();;
		ele1.click();
		
		//to double click 
		WebElement ele3 = d.findElement(By.linkText("Tabs"));
		act.doubleClick(ele1).build();
		act.doubleClick(ele1).perform();
		ele1.click();
		
		
	}

}
