package org.qsp.testPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.SeleniumHome;

public class FlipkartTest {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		SeleniumHome sh = new SeleniumHome(driver);
		Thread.sleep(2000);
		sh.sendText("java");
		sh.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		sh.clear();
		Thread.sleep(2000);
		sh.sendText("selenium");
		sh.click();
}
}
