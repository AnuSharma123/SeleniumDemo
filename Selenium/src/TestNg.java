import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNg {
/*@Test
public void demo(){
	System.setProperty("webdriver.chrome.driver",
			"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/"); 
}*/
	WebDriver driver;
	@BeforeClass
	public void Bclass(){
		System.out.println("Bc");
	}
	
	@BeforeMethod
	public void Bmethod() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		System.out.println("BM");
		System.setProperty("webdriver.gecko.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\geckodriver.exe");	
	}
	@Test
	public void demo(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); 
		System.out.println("T");
	}
	@Test
	public void demo2(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); 
		System.out.println("T2");
	}
	@AfterMethod
	public void AMethod(){
		driver.close();
	}
	@AfterClass
	public void ACMethod(){
		driver.close();
	}
}
