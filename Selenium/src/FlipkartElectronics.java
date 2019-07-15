import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FlipkartElectronics {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement mi = driver.findElement(By.xpath("//a[@href='/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi']"));
		a.doubleClick(mi).perform();
		Thread.sleep(2000);
		String phn = driver.findElement(By.xpath("//img[@alt='Redmi Note 7 Pro (Neptune Blue, 64 GB)']"));
		phn.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'NOTIFY ME')]")).click();
	}
	}
