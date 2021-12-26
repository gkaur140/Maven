package org.kaur.gurvir.NewMavneProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Question2 {
	/*
	 * Write a program to print the title of this page on console
	 * http://automationpractice.com/index.php
	 */
	WebDriver wd;

	@Test
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();

		// Get the URL of the website that we intend to test
		wd.get("http://automationpractice.com/index.php");

		System.out.println("Title of the contact us page : " + wd.getTitle());

		wd.quit();
	}

}
