package seleniumMiscellaneousScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	WebDriver driver;
	
	public void launchBrowser() throws InterruptedException {
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
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[2]/a")).click();
		Thread.sleep(1000);
	}
	
	public void printWebTable() throws InterruptedException {
		List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"tblEmployee\"]/tbody/tr"));
		System.out.println("No. of row elements are : "+rowelements.size());
		int rowsize = rowelements.size();
		List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id=\"tblEmployee\"]/tbody/tr[1]/td"));
		System.out.println("No. of column elements are : "+columnelements.size());
		int columnsize = columnelements.size();
		
		for(int i=1; i<=rowsize;i++) {
			for(int j=1; j<=columnsize;j++) {
				System.out.println(driver.findElement(By.xpath("//*[@id=\"tblEmployee\"]/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
		}
		driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/ul/li/a")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebTable obj = new WebTable();
		obj.launchBrowser();
		obj.printWebTable();

	}

}
