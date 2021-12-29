package org.kaur.gurvir.NewMavneProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisplayText {
	WebDriver wd;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Get the URL of the website that we intend to test
		wd.get("https://www.phptravels.net/signup");

		// maximise the browser window
		wd.manage().window().maximize();
	}

	@Test
	public void showText() {

		WebElement firstName = wd.findElement(By.cssSelector("input[name='first_name']"));
		firstName.sendKeys("Gurvir");

		WebElement lastName = wd.findElement(By.cssSelector("input[name='last_name']"));
		lastName.sendKeys("kaur");

		WebElement phone = wd.findElement(By.cssSelector("input[name='phone']"));
		phone.sendKeys("4314567899");

		WebElement email = wd.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("abc1234@gmail.com");

		WebElement password = wd.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("Abcd@1234");

		((JavascriptExecutor) wd).executeScript("arguments[0].scrollIntoView(true);", password);

		WebElement signUpButton = wd.findElement(By.cssSelector("button[type='submit']"));
		signUpButton.submit();

		WebElement email1 = wd.findElement(By.cssSelector("div.form-group input.form-control[name=\"email\" ]"));
		email1.sendKeys("abc1234@gmail.com");

		WebElement password1 = wd.findElement(By.cssSelector("input.form-control[name='password']"));
		password1.sendKeys("Abcd@1234");

		WebElement login = wd.findElement(By.cssSelector("div.btn-box.pt-3.pb-4 button[type='submit']"));
		login.click();

		WebElement text = wd.findElement(By.cssSelector("div.breadcrumb-content"));
		System.out.println(text.getText());

	}

	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		wd.quit();
	}

}
