import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.makemytrip.com/");
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());*/
		Thread.sleep(2000);
		/*WebElement b = driver.findElement(By.xpath("//font[contains(.,'Travel Blog')]"));
		js.executeScript("arguments[0].scrollIntoView()", b);	
		TakeScreenShot ts = new TakeScreenShot();
		ts.takeScreenShot(driver, "MMT");*/
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//to scroll full down
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");//to scroll horizontally
	}
}
