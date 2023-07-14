package StepdefinationHpcl;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class HookScreen extends TestBase
{	
		
		@After(order = 1)
		public static void takeScraenshotOnFailure(Scenario scenario) 
		{
			if (scenario.isFailed()) 
			{
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "image"); 
			}
		}
}
