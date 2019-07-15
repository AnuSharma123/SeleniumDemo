import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();// ......upcasting
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//WebElement id = driver.findElement(By.id("email"));
		//id.sendKeys("Anu");
		//WebElement id1 = driver.findElement(By.id("pass"));
		//id1.sendKeys("Anu");
		//Thread.sleep(2000);
		//WebElement button = driver.findElement(By.id("u_0_a"));
		//button.click();
		Robot r=new Robot();
		/*r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);*/
		/*r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_N);*/
		
	}

}
