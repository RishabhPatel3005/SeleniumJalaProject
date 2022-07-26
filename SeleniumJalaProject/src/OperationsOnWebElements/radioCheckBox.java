package OperationsOnWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radioCheckBox {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
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
	}
	public void createEmployee() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Rishabh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Patel");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("rishabhpatel@jala.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MobileNo\"]")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"frmEmployee\"]/div[1]/div/div[2]/div[2]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"frmEmployee\"]/div[1]/div/div[2]/div[2]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/thead/tr[2]/th[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr[2]/th[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr[2]/th[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/tbody/tr/td/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr/td/span[5]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[6]/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"rdbMale\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Address\"]")).sendKeys("Patna");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"CountryId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"CountryId\"]/option[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"CityId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"CityId\"]/option[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"chkSkill_5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkSkill_3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkSkill_2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkSkill_4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkSkill_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkSkill_6\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"frmEmployee\"]/div[2]/button")).click();
		Thread.sleep(1000);
	}
	public void radioButton() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);
         List<WebElement> radio = driver.findElements(By.name("rdbGender"));
         System.out.println("The number of elements in a radiogroup which have common name: "+radio.size());
         System.out.println(driver.findElement(By.name("rdbGender")).getAttribute("value"));
         System.out.println(driver.findElement(By.id("rdbFemale")).getAttribute("value")); 
         boolean value= driver.findElement(By.id("rdbMale")).isSelected();
         if(value==true) {
        	 System.out.println("The selected radiobutton value : "+driver.findElement(By.id("rdbMale")).getAttribute("value"));
         }
         System.out.println("Returns True if Enabled : "+ driver.findElement(By.xpath("//*[@id=\"chkSkill_2\"]")).isEnabled());
	}
	public void dropdown() {
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
		List<WebElement> options = s.getOptions();
		int i=1;
		System.out.println("The dropdown values are: ");
		for(WebElement e : options) {
			System.out.println(i+". "+e.getText());
			i++;
		}
	}
	public void dropdownselected() {
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
		List<WebElement> options = s.getOptions();
		int i=1;
		System.out.println("The selected dropdown value is : ");
		for(WebElement e : options) {
			if(e.isSelected()==true) {
			System.out.println(i+". "+e.getText());
			i++;
			}
		}
		}
	public void closeBrowser() {
		driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/ul/li/a")).click();
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		radioCheckBox obj = new radioCheckBox();
		obj.launchBrowser();
		obj.loginMagnus();
		obj.createEmployee();
		obj.radioButton();
		obj.dropdown();
		obj.dropdownselected();
		obj.closeBrowser();

	}

}
