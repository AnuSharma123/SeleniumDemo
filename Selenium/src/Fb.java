import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fb {
	public static void main(String[] args) {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement login = driver.findElement(By
				.xpath("//input[@value='Log In']"));
		// WebElement
		// name=driver.findElement(By.xpath("//input[@name='firstname']"));
		// Point loc = name.getLocation();
		// System.out.println(loc.getX());
		// System.out.println(loc.getY());
		// System.out.println(loc);
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}
}
