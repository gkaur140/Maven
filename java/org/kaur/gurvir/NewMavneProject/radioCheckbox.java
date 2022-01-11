package org.kaur.gurvir.NewMavneProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class radioCheckbox {
	WebDriver wd;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Get the URL of the website that we intend to test
		wd.get("https://jqueryui.com/checkboxradio/");

		// maximise the browser window
		wd.manage().window().maximize();
		wd.switchTo().frame(0);
		
	}

	@Test
	public void dropDown() throws InterruptedException {

		WebElement radio = wd.findElement(By.cssSelector("label[for=radio-2]"));
		radio.click();
		WebElement checkbox1 = wd.findElement(By.cssSelector("label[for=checkbox-2]"));
		checkbox1.click();
		WebElement checkbox2 = wd.findElement(By.cssSelector("label[for=checkbox-3]"));
		checkbox2.click();
		
		
	}

	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		//wd.quit();
	}

}
