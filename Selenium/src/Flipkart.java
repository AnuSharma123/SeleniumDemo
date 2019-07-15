import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		Actions a=new Actions(driver);
		for(WebElement item:menus)
		{
			System.out.println(item.getText());
			Thread.sleep(2000);
			a.moveToElement(item).perform();
			List<WebElement> submenu = driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']/parent::li/descendant::ul[@class='_3GtRpC']"));
		    for(WebElement Subname : submenu)
		    {
		    	System.out.println(Subname.getText());
		    	Thread.sleep(2000);
		    }	  
		}
	}
}
		    
	

