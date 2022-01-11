package org.kaur.gurvir.NewMavneProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver wd;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Get the URL of the website that we intend to test
		wd.get("https://jqueryui.com/selectmenu/");

		// maximise the browser window
		wd.manage().window().maximize();
		wd.switchTo().frame(0);

	}

	@Test
	public void dropDown() throws InterruptedException {

		WebElement speed = wd.findElement(By.cssSelector("span[id=speed-button]"));
		speed.click();
		// Thread.sleep(3000);
		WebElement faster = wd.findElement(By.cssSelector("div[id=ui-id-5]"));
		faster.click();

		WebElement file = wd.findElement(By.cssSelector("span[id=files-button]"));
		file.click();
		// Thread.sleep(3000);
		WebElement fileName = wd.findElement(By.cssSelector("div[id=ui-id-7]"));
		fileName.click();

		WebElement num = wd.findElement(By.cssSelector("span[id=number-button]"));
		num.click();
		// Thread.sleep(3000);
		WebElement seven = wd.findElement(By.cssSelector("div[id=ui-id-16]"));
		seven.click();

		WebElement title = wd.findElement(By.cssSelector("span[id=salutation-button]"));
		title.click();
		// Thread.sleep(3000);
		WebElement mrs = wd.findElement(By.cssSelector("div[id=ui-id-31]"));
		mrs.click();

	}

	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		wd.quit();
	}

}
