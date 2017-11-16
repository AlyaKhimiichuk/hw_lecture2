package prestashop_automation.qatestlab.com.HWtoLecture2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyMainMenu {

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
		
		WebElement dashboard = driver.findElement(By.linkText("Dashboard"));
		dashboard.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement orders = driver.findElement(By.linkText("Заказы"));
		orders.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement catalog = driver.findElement(By.linkText("Каталог"));
		catalog.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement clients = driver.findElement(By.linkText("Клиенты"));
		clients.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement support = driver.findElement(By.linkText("Служба поддержки"));
		support.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement statistics = driver.findElement(By.linkText("Статистика"));
		statistics.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement modules = driver.findElement(By.linkText("Modules"));
		modules.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement design = driver.findElement(By.linkText("Design"));
		design.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement delivery = driver.findElement(By.linkText("Доставка"));
		delivery.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement payments = driver.findElement(By.linkText("Способ оплаты"));
		payments.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement international = driver.findElement(By.linkText("International"));
		international.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement shopParameters = driver.findElement(By.linkText("Shop Parameters"));
		shopParameters.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
		
		WebElement configuration = driver.findElement(By.linkText("Конфигурация"));
		configuration.click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title after refreshing is: " + driver.getTitle());
	
		driver.quit();
		

	}
	
	public static WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		return new ChromeDriver();
}
}
