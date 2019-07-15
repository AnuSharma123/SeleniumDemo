import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;


public class bluestone1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement coins = driver.findElement(By.xpath("//a[contains(.,'Gold Coins')]/span"));
		a.moveToElement(coins).perform();
		takeScreenShot("Gold coins");
		Thread.sleep(2000);
		WebElement weight = driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-2gms,m']"));
		a.moveToElement(weight).perform();
		takeScreenShot("2gm");
}
public static void takeScreenShot(String name) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File Screens = ts.getScreenshotAs(OutputType.FILE);
	File ff = new File("./Screenshot/" + name + ".png");
	Files.copy(Screens, ff);
}
}