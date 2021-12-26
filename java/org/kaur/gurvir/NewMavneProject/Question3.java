package org.kaur.gurvir.NewMavneProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Question3 {

	/*
	 * 1: Go to http://automationpractice.com/index.php 2: enter text in search box
	 * as ‘Dress’ 3: Clear the entered text 4: Enter the text as ‘top’ 5: Click on
	 * the search icon
	 */
	WebDriver wd;

	@Test
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();

		// Get the URL of the website that we intend to test
		wd.get(" http://automationpractice.com/index.php");

		// maximise the browser window
		wd.manage().window().maximize();
		WebElement searchText = wd.findElement(By.id("search_query_top"));
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		searchText.sendKeys("Dress");

		searchText.clear();
		
		searchText.sendKeys("Top");
		
		WebElement clickSearchButton = wd.findElement(By.cssSelector("button[name='submit_search']"));
		clickSearchButton.click();

		wd.quit();
	}

}
