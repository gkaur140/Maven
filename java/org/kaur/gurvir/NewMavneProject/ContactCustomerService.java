package org.kaur.gurvir.NewMavneProject;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactCustomerService {
	WebDriver wd;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver_win32/chromedriver.exe");
		// Intialised it with Chrome driver class object
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Get the URL of the website that we intend to test
		wd.get("http://automationpractice.com/index.php");

		// maximise the browser window
		wd.manage().window().maximize();

	}

	@Test
	public void verifyingSendMessageInForm() {

		WebElement contactUs = wd.findElement(By.cssSelector("div a[title='Contact Us']"));

		contactUs.click();

		WebElement subjectHeading = wd.findElement(By.cssSelector("select[id=id_contact]"));

		//subjectHeading.click();
		Select select = new Select(subjectHeading);

		// Select using index method
		// select.selectByIndex(0);
		select.selectByVisibleText("Customer service");

		//WebElement customerService = wd.findElement(By.cssSelector("select option[value='2']"));
		//customerService.click();

		WebElement email = wd.findElement(By.cssSelector("input[id=email]"));
		email.sendKeys("gurvirgill2@yahoo.com");

		WebElement referenceId = wd.findElement(By.cssSelector("input[id=id_order]"));
		referenceId.sendKeys("RG58KCV3858");

		WebElement message = wd.findElement(By.cssSelector("textarea[id=message]"));
		message.sendKeys("Not delivered parsel");

		WebElement file = wd.findElement(By.id("fileUpload"));
		file.sendKeys("C:\\Users\\User\\Downloads\\PHOTO-2022-01-04-09-03-58 (1).jpg");

		WebElement send = wd.findElement(By.id("submitMessage"));
		send.click();

		WebElement text = wd.findElement(By.cssSelector("p.alert.alert-success"));

		Assert.assertEquals(text.getText(), "Your message has been successfully sent to our team.");
	}

	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		wd.quit();
	}

}
