package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		System.out.println("Current url of the page : "+ driver.getCurrentUrl());
		System.out.println("Title of the page : "+ driver.getTitle());
		System.out.println("SOurce of the page : "+ driver.getPageSource());
	}
	public void loginMagnus() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
		Thread.sleep(1000);
		driver.findElements(By.className("form-control")).clear();
		Thread.sleep(1000);
		System.out.println("Handle of the WebPage: " +driver.getWindowHandle());
		driver.switchTo();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.navigate().to("https://jalaacademy.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);
	}
	public void anothermethod() throws InterruptedException {
		System.out.println("The getAttribute value for radiobutton male is: "+driver.findElement(By.xpath("//*[@id=\"rdbMale\"]")).getAttribute("value"));
		System.out.println("The tagname for following web element: "+ driver.findElement(By.xpath("//*[@id=\"frmEmployee\"]/div[2]/button")).getTagName());
		driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/ul/li/a")).click();
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverMethods obj = new WebDriverMethods();
		obj.launchBrowser();
		obj.loginMagnus();
		obj.anothermethod();

	}

}
