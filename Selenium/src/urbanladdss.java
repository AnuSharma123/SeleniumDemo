import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class urbanladdss {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException,
			IOException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(2000);
		takeScreenShot("urbanDemo");
		driver.findElement(
				By.xpath("//a[@class='close-reveal-modal hide-mobile']"))
				.click();
		Thread.sleep(2000);
		takeScreenShot("UrbanClose");
		List<WebElement> menu = driver.findElements(By
				.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		for (WebElement name : menu) {
			String item = name.getText();
			a.moveToElement(name).build().perform();
			takeScreenShot(item);
			System.out.println(item);
		}

	}

	public static void takeScreenShot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Screens = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./Screenshot/" + name + ".png");
		Files.copy(Screens, ff);
	}
}