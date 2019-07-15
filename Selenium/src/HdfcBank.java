import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HdfcBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/assets/popuppages/netbanking.htm");
		driver.manage().window().maximize();
		//driver.close();
		System.out.println(driver.getTitle());
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		System.out.println(driver.getCurrentUrl());
		
	}
}
