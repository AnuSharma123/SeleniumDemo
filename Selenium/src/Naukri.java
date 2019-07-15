import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukri {
public static void main(String[] args) throws InterruptedException {
	System.setProperty(
			"webdriver.chrome.driver",
			"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	Set<String> Win = driver.getWindowHandles();
	/*Win.remove(parent);//if we want to remove only child browsers...we can do that using remove method presents in SET
	for(String CWin : Win){
		Thread.sleep(2000);
		System.out.println(CWin);
		driver.switchTo().window(CWin);
		driver.close();
		
	}
	*/
	//ArrayList<String> a=new ArrayList<>(Win);
	ArrayList<String> a=new ArrayList<>();
	a.addAll(Win);
	System.out.println(a);
	for(int i= a.size()-1;i>=0;i--)
		driver.switchTo().window(a.get(i));
	driver.close();
} 
}
