import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class html {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Anu/Desktop/Anu.html");
	WebElement num=driver.findElement(By.id("b"));
	Select s=new Select(num);
	List<WebElement>option=s.getOptions();
	for(WebElement numb:option)
	{
		s.selectByValue(numb.getText());
	}
	Thread.sleep(2000);
	s.deselectAll();
}
}
