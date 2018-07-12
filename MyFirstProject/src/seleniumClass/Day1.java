package seleniumClass;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;
	
public class Day1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Sharath\\Selenium_Workspace\\JARS\\BrowserExes\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
/*		Day1 obj = new Day1();

		obj.login("Sharath818", "Inian@123");*/
		
		
		//		
//		System.out.println(driver.getTitle()); //To Get the Titl
//		driver.manage().window().maximize(); // Maximize your browser window
//		driver.findElement(By.id("header_tab_hotels")).click();
////		Thread.sleep(8000);
		
		
//		driver.navigate().back();
//		driver.navigate().forward(); // this three methods will be used to move backward , forward and to refresh the page
//		driver.navigate().refresh();
		
		
/*		driver.close(); // to close the current session 
		
		driver.quit();  // it will hclose all the browser windows which are open in current session
		
		
		driver.getCurrentUrl(); //it retrives current URL
		 
		driver.getPageSource(); // it get the html code 
		
*/
		
//		driver.findElement(By.linkText("HOLIDAYS")).click();
		
		
/*		String url = "http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
		String url1 = "file:///C:/Users/BharathGupta/Desktop/MorningClassHTMLS/First.html";*/
	
		
//		driver.get("http://toolsqa.com/automation-practice-switch-windows/"); // get met
		
	/*	String pareWindow = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		*/
//		driver.findElement(By.xpath("//*[contains(text(),'New Message Window')]")).click();;
  
		
		
//		driver.quit();
		
		
		
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("HYDERABAD");
		Thread.sleep(1000);	
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("PUNE");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='chf_rs_active']/span[@class='nav_text']")).click();
//		driver.findElement(By.tagName("button")).click();
//		driver.switchTo().frame(driver.findElement(By.id("Frame2")));
	


/*		
		driver.findElement(By.id("FirstTextBox")).sendKeys("Sahrath");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("Frame1")));
		
		driver.findElement(By.id("FirstTextBox")).sendKeys("Sahrath");
 	
		*/
		
	/*	driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
    		
		driver.switchTo().alert().accept();  
		
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]")).click();*/
		
/*		
		driver.findElement(By.xpath("//input[@value='Sharath']")).clear();
		driver.findElement(By.xpath("//input[@value='Sharath']")).sendKeys("XPATH");
		
//		
*///		WebElement ele ; 
//		ele  = driver.findElement(By.id("idid"));
//		ele.sendKeys("sdkdkjf");
		
	/*	driver.switchTo().frame(driver.findElement(By.id("Frame1")));
		driver.findElement(By.id("idid")).clear();
		driver.findElement(By.id("idid")).sendKeys("FirstTextBox");
		driver.switchTo().defaultContent();
		driver.findElement(By.className("MNameName")).sendKeys("not in frame");*/
		
//		System.out.println(driver.findElement(By.tagName("title")).getText());
		
	
/*		
		int size=driver.findElements(By.xpath("//*[@id='ddl']/option")).size();
		System.out.println(size);*/
		
		
//		System.out.println(driver.getCurrentUrl());
		/*
		String str ="Java#C#python"; //"Java#Ruby#DotNet#C";
		
		
		String exp[] = str.split("#");
		
		System.out.println(exp.length);
		
		for(int i = 0; i<exp.length;i++){
			System.out.println(exp[i]);
			
			verifyDDlValues(exp[i]);
			
			
		}*/
		

//		for()
		
		
//		driver.close();
		
//		Thread.sleep(3000);
////		driver.switchTo().frame(0);
//		driver.findElement(By.id("FirstTextBox1")).clear();
//		driver.findElement(By.id("FirstTextBox1")).sendKeys("secondTextBox");
////		driver.close();
		
//		int a[] = new int[5];
		
//		System.out.println(driver.findElements(By.name("gender")).size());
//		driver.findElements(By.name("gender")).get(2).click();
		
/*		String title = driver.getTitle(); //fetchs the title of the page		
		System.out.println("Title of the page is: "+title );

		
//		Thread.sleep(5000);
		driver.manage().window().maximize();
//		driver.close();
		
		System.out.println("Page Title");
		System.out.println(driver.getTitle());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();	
		System.out.println("Current URL");
		System.out.println(driver.getCurrentUrl());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Page Source");
		System.out.println(driver.getPageSource());
		
*///		driver.findElement(By.partialLinkText("nium")).click();				
//		driver.findElement(By.partialLinkText("page")).click();			
//		driver.findElement(By.name("Sharath")).click();
//		driver.findElement(By.className("LastName")).clear();
//		driver.findElement(By.className("LastName")).sendKeys("gupta");
//		driver.findElement(By.tagName("input")).sendKeys("tagname");
		
		
//		Select sle = new Select(driver.findElement(By.id("day")));
		
//		sle.selectByVisibleText("Ruby");
//		sle.selectByValue("2");
//		System.out.println(sle.getFirstSelectedOption().getText());
		
		
		
	}

	static public void verifyDDlValues(String str){
		
		boolean flag = false;
		int size = driver.findElements(By.xpath("//*[@id='ddl']/option")).size();
		String actVal =null;
		for(int i=0;i<size;i++){
			actVal = driver.findElements(By.xpath("//*[@id='ddl']/option")).get(i).getText();
			
			if(str.equalsIgnoreCase(actVal)){
//				System.out.println("Pass");
				flag = true;			
				break;
			}else{
				flag = false;
//				System.out.println("Fail");
			}
		}
		
		if(flag){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
	
	
	public void login(String UN, String PW) throws InterruptedException{	
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(UN);
		driver.findElement(By.xpath("//content[@class='CwaK9']/span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(PW);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}
	
	
	
}
