import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UrbanladderWritingMenus {
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver",
			"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
}
}
