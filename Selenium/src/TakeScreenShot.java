import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


public class TakeScreenShot {
	public void takeScreenShot(WebDriver driver, String name)
			throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File ScreenSh = ts.getScreenshotAs(OutputType.FILE);
		File ss= new File("./Screenshot/"+name+".png");
		Files.copy(ScreenSh, ss);
	}

}
