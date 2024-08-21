package BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapper {

	public WebDriver driver;

	public void launchApplication(String browser,String url){
		try{
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\844888\\BMW\\src\\test\\resources\\Driver\\chromedriver_v80.exe");
				driver=new ChromeDriver();	
			}
			else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.chrome.driver", "C:\\844888\\BMW\\src\\test\\resources\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();	
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get(url);
		}
		catch(WebDriverException e){
			e.printStackTrace();
		}
	}

	public void Screenshot(String path) throws IOException{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File loc=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(loc, new File(path));
	}

	public void end(){
		driver.close();
	}
}
