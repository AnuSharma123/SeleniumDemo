import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Bluestone {
public static void main(String[] args) {
	System.setProperty(
			"webdriver.chrome.driver",
			"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
	search.sendKeys("Rings",Keys.ENTER);
	WebElement price=driver.findElement(By.xpath("//span[@class='title style-fill i-right']/span[contains(.,'Price')]"));
	Actions a=new Actions(driver);
	a.moveToElement(price).perform();
	WebElement below=driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']"));
	below.click();
	
	
}
}
