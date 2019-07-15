import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class urban {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(2000);
		WebElement popup=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		popup.click();
		Actions a=new Actions(driver);
		WebElement sale=driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/span"));
		Thread.sleep(2000);
		a.moveToElement(sale).perform();
		//System.out.println(sale.getText());	
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));
		for(WebElement item:menus)
		{
			System.out.println(item.getText());
			Thread.sleep(2000);
			a.moveToElement(item).perform();
		
		}
	}
		
	}
