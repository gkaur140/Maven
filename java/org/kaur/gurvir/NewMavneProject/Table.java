package org.kaur.gurvir.NewMavneProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Table {
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
		WebElement admin = wd.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
		WebElement status = wd.findElement(By.cssSelector("select[id=searchSystemUser_status]"));
		Select select = new Select(status);
		select.selectByIndex(2);
		WebElement search = wd.findElement(By.id("searchBtn"));
		search.click();
		List<WebElement> noOfRows = wd.findElements(By.cssSelector("tbody tr"));
		int index = 1;

		while (noOfRows.size() >= index)

		{
			WebElement name = wd.findElement(By.xpath("//tbody//tr[" + index + "]//td[4]"));
			System.out.println(name.getText());
			index++;
		}

	}

	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		wd.quit();
	}

}
