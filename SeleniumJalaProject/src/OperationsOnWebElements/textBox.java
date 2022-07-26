package OperationsOnWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBox {
	WebDriver driver;
	
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://magnus.jalatechnologies.com/");
		Thread.sleep(1000);
	}
	public void textBoxFunction() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");//How to Type in text box using Selenium Web Driver
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");////How to Type in text box using Selenium Web Driver
		Thread.sleep(1000);
		System.out.println("The entered text in textbox: "+ driver.findElement(By.xpath("//*[@id=\"UserName\"]")).getAttribute("value"));//How to get a Text Box value using Selenium Web Driver
		System.out.println("The entered placeholder in the textbox is: "+ driver.findElement(By.xpath("//*[@id=\"Password\"]")).getAttribute("placeholder"));//How to read the placeholder value of a Text Box using getAttribute() method
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).clear();//Deleting/clear text from the Text Box
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();//Deleting/clear text from the Text Box
		System.out.println("If true, the webelement is enabled; else false means disabled: "+driver.findElement(By.xpath("//*[@id=\"UserName\"]")).isEnabled());//Check if Text Box is enabled/disabled
	}
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		textBox obj = new textBox();
		obj.launchBrowser();
		obj.textBoxFunction();
		obj.closeBrowser();
		

	}

}
