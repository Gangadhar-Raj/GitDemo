package MY.Tmoney;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMytmoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
	 System.setProperty("Webdriver.chrome.driver", "E:\\Udemy\\Selenium\\Grid\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();  
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.get("http://10.242.0.162:8191/mt_mm/login");
	 driver.findElement(By.xpath("(//input[@class='form-control']) [1]")).sendKeys("admin");
	 driver.findElement(By.xpath("//*[@id='pwd_custom_ip']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	 driver.findElement(By.xpath("//li[@class='nav-item'] [2]")).click();
	 
	 driver.findElement(By.xpath("//*[@class='float-left'] [contains(text(),'My Profile')]")).click();
		
		  WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		  
		  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		  "//a[@class='opened']")));
		  driver.findElement(By.xpath("//a[@class='opened']")).click();
		  
		  
		  System.out.println("Hello im From demo");
		  System.out.println("Hello im have done changes");
		  
		  
	}

}
