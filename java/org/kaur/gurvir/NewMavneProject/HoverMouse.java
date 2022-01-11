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

public class HoverMouse {
	WebDriver wd;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Get the URL of the website that we intend to test
		wd.get("https://jqueryui.com/menu/");

		// maximise the browser window
		wd.manage().window().maximize();
		wd.switchTo().frame(0);

	}

	@Test
	public void electronic() {

		Actions actions = new Actions(wd);
		WebElement electronicText = wd.findElement(By.id("ui-id-4"));
		// electronicText.click();
		actions.moveToElement(electronicText).perform();

	}

	@Test
	public void music() {
		Actions actions = new Actions(wd);
		WebElement musicText = wd.findElement(By.cssSelector("div[id='ui-id-9']"));
		// electronicText.click();
		actions.moveToElement(musicText).perform();

	}

	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		 wd.quit();
	}

}
