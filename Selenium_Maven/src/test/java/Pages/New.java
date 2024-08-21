package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class New {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='nav-item']")
	public WebElement dwnld;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/p[2]/a")
	public WebElement doc;

	@FindBy(xpath="//*[@id='sidebar']/div[2]/ul/li[9]/ul/li[4]/a")
	public WebElement grd;
	
	public void meth2() throws InterruptedException{
		dwnld.click();
		Thread.sleep(3000);
		doc.click();
		Thread.sleep(3000);
		grd.click();
		
	}

}
