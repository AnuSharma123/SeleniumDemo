import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException,
			IOException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		/*
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 */
		WebElement d = driver.findElement(By
				.xpath("//span[contains(.,'Shop for your Living room')]"));
		js.executeScript("arguments[0].scrollIntoView()", d);
		TakeScreenShot ts = new TakeScreenShot();
		ts.takeScreenShot(driver, "Amazan");
		
	}
}
