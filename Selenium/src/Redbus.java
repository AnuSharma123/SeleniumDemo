import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Redbus {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty(
			"webdriver.chrome.driver",
			"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
	WebElement d = driver.findElement(By.xpath("//div[contains(.,'Introducing On-Time Guarantee')]/parent::span[@class='fl']"));
	js.executeScript("arguments[0].scrollIntoView()", d);	
	TakeScreenShot ts = new TakeScreenShot();
	ts.takeScreenShot(driver, "Redbus");
}
}
