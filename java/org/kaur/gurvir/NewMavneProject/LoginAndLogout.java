package org.kaur.gurvir.NewMavneProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginAndLogout {

	WebDriver wd;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Get the URL of the website that we intend to test
		wd.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		// maximise the browser window
		wd.manage().window().maximize();
	}

	@Test
	public void login() {
		WebElement userName = wd.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");

		WebElement password = wd.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginButton = wd.findElement(By.id("btnLogin"));
		loginButton.click();

		// Actions actions = new Actions(wd);

		WebElement welcomeText = wd.findElement(By.cssSelector("div[id='branding'] a[id='welcome']"));
		// actions.moveToElement(welcomeText).perform();
		welcomeText.click();

		WebElement logoutButton = wd.findElement(By.cssSelector("div>ul>li>a[href='/index.php/auth/logout']"));
		logoutButton.click();
	}

	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		wd.quit();
	}

}
