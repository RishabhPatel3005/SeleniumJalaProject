import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLocators {
	WebDriver driver;
	
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://magnus.jalatechnologies.com/");
		Thread.sleep(1000);
	}
	public void locator() throws InterruptedException {
		driver.findElement(By.id("UserName"));
		driver.findElement(By.linkText("Admin Login"));
		driver.findElement(By.className("login-box-body"));
		driver.findElement(By.name("Password"));
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		Thread.sleep(1000);
	}
	public void automationScripts() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");//automation script 1
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");//automation script 2
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();//automation script 3
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();//automation script 4
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[2]/a")).click();//automation script 5
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("Rishabh");//automation script 6
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();//automation script 7
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/ul/li/a")).click();//automation script 8
	}
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		seleniumLocators obj = new seleniumLocators();
		obj.launchBrowser();
		obj.locator();
		obj.automationScripts();
		obj.close();

	}

}
