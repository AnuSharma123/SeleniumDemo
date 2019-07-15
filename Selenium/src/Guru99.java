
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Guru99 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/index.php");
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
}
}