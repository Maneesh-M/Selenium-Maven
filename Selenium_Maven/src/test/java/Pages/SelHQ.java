package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelHQ {

public WebDriver driver;

@FindBy(xpath="//a[@class='nav-item']")
public WebElement dwnld;

@FindBy(xpath="/html/body/div[2]/div[2]/p/a[2]")
public WebElement bit;

public void method(){
	dwnld.click();
	bit.click();
}
}