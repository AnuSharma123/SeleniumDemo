import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		WebElement email = driver.findElement(By.xpath("//div [@jscontroller='pxq3x']/descendant::input[@type='email']"));
		email.sendKeys("anu.s.anuja");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
		WebElement button = driver.findElement(By
				.xpath("//div[@jsname='DH6Rkf']/descendant::span[@class='CwaK9']"));
		button.click();
		Thread.sleep(5000);
		WebElement passwrd = driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
		passwrd.sendKeys("12346");
		WebElement button1 = driver.findElement(By
				.xpath("//div[@id='passwordNext']/span[@class='CwaK9']/span[@class='RveJvd snByac']"));
		button1.click();
	}

}
