package seleniumMiscellaneousScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	WebDriver driver;
	public void loginMagnus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://magnus.jalatechnologies.com/");
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(1000);
	}
	public void iframe() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[11]/a")).click();
		Thread.sleep(1000);
		List<WebElement> iframeelements = driver.findElements(By.tagName("iframe"));
		System.out.println("No. fo iframes are: "+iframeelements.size());
		Thread.sleep(1000);
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/ul/li/a")).click();
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		IFrame obj = new IFrame();
		obj.loginMagnus();
		obj.iframe();

	}

}
