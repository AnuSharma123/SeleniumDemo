import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipkart1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("c#book",Keys.ENTER);  
		Thread.sleep(2000);
		WebElement price = driver.findElement(By.xpath("//div[contains(.,'Price -- Low to High')]/parent::div[@class='_3ywJNQ']"));
		Actions a = new Actions(driver);
		a.doubleClick(price).build().perform();
		for (WebElement rates : rating){
			String rate = rates.getText();
			System.out.println(rate);
			i = Double.parseDouble(rate);
			if (big < i)
				big = i;
		}
		Thread.sleep(1000);
		System.out.println("-------------------");
		
		int Rating = (int)big;
		System.out.println(Rating);
		WebElement book = driver.findElement(By.xpath(""));
		book.click();
		Thread.sleep(2000);
		Set<String> subTva = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String tab : subTva);
		{
		driver.switchTo().window(phn);
		}
		driver.findElement(By.xpath("")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("")).click();
}
}
