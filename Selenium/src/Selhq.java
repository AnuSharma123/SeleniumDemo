import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selhq {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("q"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(2000);
		search.sendKeys("selenium",Keys.ENTER);
		
}
}
