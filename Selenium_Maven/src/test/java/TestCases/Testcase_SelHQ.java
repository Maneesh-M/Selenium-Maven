package TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.Wrapper;
import Pages.SelHQ;

public class Testcase_SelHQ extends Wrapper{


	@BeforeTest
	public void start(){
		launchApplication("chrome","https://www.seleniumhq.org");
	}

	@Test
	public void run(){
		SelHQ hq=new SelHQ();
		hq=PageFactory.initElements(driver,SelHQ.class); 
		hq.method();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f=new File("C:\\Users\\BLTuser.BLT144\\Downloads\\IEDriverServer_x64_3.150.1.zip");
		boolean a=f.exists();
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(a, true);
		sa.assertAll();
		System.out.println(a);
		
	}
	
	@AfterTest
	public void stop() throws IOException{
			Screenshot("C:\\844888\\Selenium_Maven\\src\\test\\resources\\Screenshots\\sel.png");
		
		end();
	}

}
