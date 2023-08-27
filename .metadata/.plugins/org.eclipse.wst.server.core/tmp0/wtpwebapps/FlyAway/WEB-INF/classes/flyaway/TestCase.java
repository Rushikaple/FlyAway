package flyaway;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase {
	

	@Test
	public void LoginPage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/rushikeshkaples/Downloads/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8081/FlyAway/");

		Thread.sleep(3000);
		WebElement courseElement =
				driver.findElement(By.xpath("//select[@name='source']"));
		Select courseNameDropdown = new Select(courseElement);
		courseNameDropdown.selectByIndex(2);

		Thread.sleep(3000);
		WebElement courseElement1 =
				driver.findElement(By.xpath("//select[@name='destination']"));
		Select courseNameDropdown1 = new Select(courseElement1);
		courseNameDropdown1.selectByIndex(3);
		
		PageFactory.initElements(driver, HomePage.class);
		
		Thread.sleep(3000);
		HomePage.submit.click();
		
		Thread.sleep(3000);
		HomePage.bookflight.click();
		
		Thread.sleep(3000);
		HomePage.Loginbutton.click();
		
		PageFactory.initElements(driver, LoginPage.class);
		
		Thread.sleep(3000);
		LoginPage.signup.click();
		
		PageFactory.initElements(driver, RegistrationPage.class);
		
		Thread.sleep(3000);
		RegistrationPage.email.sendKeys("kalpanakutty49@gmail.com");
		
		Thread.sleep(3000);
		RegistrationPage.password.sendKeys("12345");
		
		Thread.sleep(3000);
		RegistrationPage.cnfpassword.sendKeys("12345");
		
		Thread.sleep(3000);
		RegistrationPage.name.sendKeys("kalpana");
		
		Thread.sleep(3000);
		RegistrationPage.address.sendKeys("322s,kovaipudhur");
		
		Thread.sleep(3000);
		RegistrationPage.city.sendKeys("coimbatore");
		
		Thread.sleep(3000);
		RegistrationPage.signupbutton.click();
		
		PageFactory.initElements(driver, RegisterPage.class);
		
		Thread.sleep(3000);
		RegisterPage.login.click();
		
		Thread.sleep(3000);
		LoginPage.Loginemail.sendKeys("kalpanakutty49@gmail.com");
		
		Thread.sleep(3000);
		LoginPage.Loginpassword.sendKeys("12345");
		
		Thread.sleep(3000);
		LoginPage.Loginbutton.click();
		
		PageFactory.initElements(driver, DashboardPage.class);
		
		Thread.sleep(3000);
		DashboardPage.Home.click();
		
		Thread.sleep(3000);
		WebElement courseElement3 =
				driver.findElement(By.xpath("//select[@name='source']"));
		Select courseNameDropdown3 = new Select(courseElement3);
		courseNameDropdown3.selectByIndex(2);

		Thread.sleep(3000);
		WebElement courseElement4 =
				driver.findElement(By.xpath("//select[@name='destination']"));
		Select courseNameDropdown4 = new Select(courseElement4);
		courseNameDropdown4.selectByIndex(3);
		
		Thread.sleep(3000);
		HomePage.submit.click();
		
		Thread.sleep(3000);
		HomePage.bookflight.click();
		
		PageFactory.initElements(driver, BookingPage.class);
		
		Thread.sleep(3000);
		BookingPage.bookaflight.click();
		
}
}

