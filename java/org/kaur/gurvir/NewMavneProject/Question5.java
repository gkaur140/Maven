package org.kaur.gurvir.NewMavneProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Question5 {
	/*
	 * 1: Go to page https://www.rogers.com/ 2: Verify if logo is displayed 3: Print
	 * the result on console
	 */
	WebDriver wd;

	@Test
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();

		// Get the URL of the website that we intend to test
		wd.get("https://www.rogers.com/");
		WebElement logo = wd.findElement(By.cssSelector("img.rcl-icon-logo[alt='Rogers']"));
		System.out.println("Logo being displayed is : " + logo.isDisplayed());

		// wd.manage().window().maximize();
		wd.quit();
	}

}
