package TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.Wrapper;
import Pages.New;
import Pages.SelHQ;

public class Testcase_New extends Wrapper{

	@BeforeTest
	public void start(){
		launchApplication("chrome","https://www.seleniumhq.org");
	}
	
	@Test
	public void run() throws InterruptedException{
		New nw=new New();
		nw=PageFactory.initElements(driver,New.class); 
		//Thread.sleep(3000);
		nw.meth2();
	}
	
	@AfterTest
	public void stop(){
		try {
			Screenshot("C:\\844888\\Selenium_Maven\\src\\test\\resources\\Screenshots\\se2.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end();
	}
}
