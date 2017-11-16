package prestashop_automation.qatestlab.com.HWtoLecture2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAdminPanel {
	public static void main(String[] args) {
		String baseUrl = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
		WebDriver driver = initChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("webinar.test@gmail.com");
		WebElement passwordField = driver.findElement(By.id("passwd"));
		passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
		WebElement loginButton = driver.findElement(By.name("submitLogin"));
		loginButton.click();
		WebElement userAvatar = driver.findElement(By.id("employee_infos"));
		userAvatar.click();
		WebElement logoutLink = driver.findElement(By.id("header_logout"));
		logoutLink.click();
		System.out.println("Test Successful");
		
		driver.quit();
		
	}
	
	public static WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		return new ChromeDriver();
		
	}

}
