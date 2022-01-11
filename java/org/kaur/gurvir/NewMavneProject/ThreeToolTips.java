package org.kaur.gurvir.NewMavneProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreeToolTips {
	WebDriver wd;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Get the URL of the website that we intend to test
		wd.get("https://jqueryui.com/tooltip/");

		// maximise the browser window
		wd.manage().window().maximize();
		wd.switchTo().frame(0);
	}

	
	@Test
	public void toolTip() throws InterruptedException {
		Actions action = new Actions(wd);
		WebElement toolTip1 = wd.findElement(By.cssSelector("html body p a[href='#']"));

		action.moveToElement(toolTip1).perform();
		
		Thread.sleep(3000);
		WebElement toolTip2 = wd.findElement(By.cssSelector("a[href=\"http://jqueryui.com/themeroller/\"]"));

		action.moveToElement(toolTip2).perform();
		
		Thread.sleep(3000);
		WebElement toolTip3 = wd.findElement(By.cssSelector("input[id='age']"));

		action.moveToElement(toolTip3).perform();
		
		Thread.sleep(3000);
		
		//String attributeValue=toolTip1.getAttribute("");
		
		//Assert.assertEquals(attributeValue, "buttonToolTip");
	}

	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		wd.quit();
	}

}
