package seleniumMiscellaneousScenarios;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
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
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"frmLinks\"]/div/div/div/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
	}
	public void noOfLinks() throws InterruptedException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are : "+ links.size());
		for(int i=0; i<links.size(); i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyLinks(url);
		}
		Thread.sleep(1000);
		driver.quit();
	}
	public void verifyLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}catch(Exception e) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		BrokenLinks obj = new BrokenLinks();
		obj.launchBrowser();
		obj.noOfLinks();

	}

}
