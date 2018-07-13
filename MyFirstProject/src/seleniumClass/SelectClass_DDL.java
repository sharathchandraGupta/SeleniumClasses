package seleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_DDL {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sharath\\Selenium_Workspace\\JARS\\BrowserExes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/DesktopBackup/HTML_Pages/First.html");
		WebElement ele = driver.findElement(By.id("FirDDL"));
		
		Select obj_DDL = new Select(ele);	
		System.out.println(obj_DDL.getFirstSelectedOption().getText());; // default value which is selected
		
//		obj_DDL.selectByVisibleText("DotNet");// it will allow you to select the value by providing the ddl value 
//		obj_DDL.selectByIndex(2);// it will allow you to select the value with index no

		obj_DDL.selectByValue("2");// it will allow you to select the value based on value attribute

		List<WebElement> ddl_o = obj_DDL.getOptions(); // it will get you all the list of elemetns presents in DDL
		for(int i=0; i<ddl_o.size();i++){
			System.out.println(ddl_o.get(i).getText());
		}
	}
}