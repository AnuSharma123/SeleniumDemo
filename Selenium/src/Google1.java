import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//WebElement id = driver.findElement(By.name("q"));
		//id.sendKeys("What is Selenium?", Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Facebook");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//div [@jsname='aajZCb']/descendant::input[@class='gNO89b']"));
		button.click();
		//driver.get("facebook url");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}