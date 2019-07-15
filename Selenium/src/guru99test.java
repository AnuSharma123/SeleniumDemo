import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class guru99test 
//file uploading through selenium
{
	public static void main(String[] args) throws IOException,
			InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).click();
		Thread.sleep(2000);
		Runtime rt = Runtime.getRuntime();
		rt.exec("C:\\Users\\Anu\\Desktop\\demo.exe");
}
}
