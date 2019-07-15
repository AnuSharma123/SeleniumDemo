import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws InterruptedException, AWTException 
{
	System.setProperty("webdriver.chrome.driver","F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement id=driver.findElement(By.name("q"));
	/*id.sendKeys("What is Selenium?");*/
		Thread.sleep(2000);
	/*WebElement button=driver.findElement(By.name("btnK"));
	button.click();
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("java",Keys.ENTER);*/
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	WebElement button=driver.findElement(By.name("btnK"));
	button.click();
}
}
