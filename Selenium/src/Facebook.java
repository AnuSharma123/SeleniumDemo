import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value=('anu')");
		/*WebElement id = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='Anu';", id);*/
		js.executeScript("document.getElementsByName('email')[0].value=('Anu')");
		
		/*WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("Anu");
		WebElement id1 = driver.findElement(By
				.xpath("//tr/td/input[@type='password']"));
		id1.sendKeys("Anu");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By
				.xpath("//input[@value='Log In']"));
		button.click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//li[@class='topnav_item newunit']/span"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
	}
}
