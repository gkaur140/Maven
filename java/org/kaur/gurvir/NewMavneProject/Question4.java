package org.kaur.gurvir.NewMavneProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Question4 {
	/*
	 * 1: Go to this website https://demoqa.com/login 2: Enter user name as
	 * ‘pivot_academy’ 3: Enter password as ‘Password@123’ 4: Click on login button
	 */
	WebDriver wd;

	@Test
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();

		// Get the URL of the website that we intend to test
		wd.get(" https://demoqa.com/login");

		// maximise the browser window
		wd.manage().window().maximize();

		WebElement userName = wd.findElement(By.id("userName"));
		userName.sendKeys("pivot_academy");

		WebElement password = wd.findElement(By.id("password"));
		password.sendKeys("Password@123");

		WebElement loginButton = wd.findElement(By.id("login"));
		loginButton.click();

		// wd.quit();
	}

}
