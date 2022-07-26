package PopupsAlertsAndWindows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupsAlertsWindows {
	WebDriver driver;
	
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://magnus.jalatechnologies.com/");
	}
	public void loginMagnus() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[2]/a")).click();
		Thread.sleep(1000);
	}
	public void popup() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("Rishabh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tblEmployee\"]/tbody/tr[1]/td[9]/a[2]")).click();
		Thread.sleep(1000);
		System.out.println("Text inside popup window: "+ driver.findElement(By.xpath("/html/body/div[4]/div")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[8]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"confirmBox\"]")).click();
		Thread.sleep(1000);
		Alert al1 = driver.switchTo().alert();
		al1.dismiss();
		Thread.sleep(1000);
	}
	
	public void closeBrowser() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/ul/li/a")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		popupsAlertsWindows obj = new popupsAlertsWindows();
		obj.launchChrome();
		obj.loginMagnus();
		obj.popup();
		obj.closeBrowser();
	}

}
