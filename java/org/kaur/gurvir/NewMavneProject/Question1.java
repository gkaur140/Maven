package org.kaur.gurvir.NewMavneProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question1 {
	/*
	 * 1: Go to https://demoqa.com/checkbox 2: Click on Yes radio button 3: Print
	 * the text which shows up when user click on button on the console
	 */
	WebDriver wd;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();

		// Get the URL of the website that we intend to test
		wd.get("https://demoqa.com/checkbox");

		// maximise the browser window
		wd.manage().window().maximize();

	}

	@Test(priority = 1)
	public void displayText() throws InterruptedException {

		WebElement radioButton = wd.findElement(By.cssSelector("ul.menu-list li:nth-child(3)" + ""));
		((JavascriptExecutor) wd).executeScript("arguments[0].scrollIntoView(true);", radioButton);

		// Thread.sleep(3000);

		radioButton.click();
		Thread.sleep(3000);
		WebElement yesOption = wd.findElement(By.cssSelector("div.custom-radio label[for='yesRadio']"));

		yesOption.click();
		Thread.sleep(3000);
		WebElement yesMes = wd.findElement(By.cssSelector("p.mt-3"));
		String message = yesMes.getText();
		System.out.println(message);

	}

}
