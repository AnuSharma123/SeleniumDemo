import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/slider/");
	Thread.sleep(2000);
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	Actions a=new Actions(driver);//actions is nonstatic method 
	//a.doubleClick(slider).build().perform();
	//a.contextClick(slider).build().perform();//takes argument as Webelement which is a interface//
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.id("slider"));
	for(int i=1;i<=5;i++)
	{
	a.dragAndDropBy(ele, 200, 0).build().perform();
	Thread.sleep(2000);
	a.dragAndDropBy(ele, -200, 0).build().perform();
	}
	}
}
