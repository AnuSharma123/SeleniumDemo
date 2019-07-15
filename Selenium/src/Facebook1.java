import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.yaml.snakeyaml.events.Event.ID;

public class Facebook1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"F:\\java 64 bit\\eclipse-java-luna-SR1a-win32-x86_64\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(id.isDisplayed());
		//System.out.println(id.isEnabled());
		WebElement date=driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByIndex(15);
		//s.selectByValue("15");
		WebElement mnt=driver.findElement(By.id("month"));
		Select s1=new Select(mnt);
		s.selectByIndex(4);
		WebElement yr=driver.findElement(By.id("year"));
		Select s2=new Select(yr);
		s.selectByValue("2006");
		List<WebElement> month=s.getOptions();
		for(WebElement name:month)
		{
			System.out.println(name.getText());
		}
		for (int i=0;i<month.size();i++)
			System.out.println(month.get(i).getText());
	}
}
