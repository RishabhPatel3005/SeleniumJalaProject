package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNGPriority {
	WebDriver driver;
	
	@Test(priority = 2)
	public void loginMagnus() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(1000);
	}
	
    @Test(priority = 3)
	public void logOut() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/ul/li/a")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
	@Test(priority = 1)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://magnus.jalatechnologies.com/");
	}

}
