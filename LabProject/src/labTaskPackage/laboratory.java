package labTaskPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class laboratory {

	
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://gor-pathology.web.app");
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
	 
		Thread.sleep(2000);	
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234",Keys.ENTER);
		Thread.sleep(5000);
		
		
		
		WebElement scrollTill = driver.findElement(By.xpath("//div[text()='Total']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollTill);
		
	driver.findElement(By.xpath("//label[text()='Add tests for patient']")).sendKeys("AFP (ALPHA FETO PROTEINS) - 350₹");
	driver.findElement(By.xpath("//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input']")).sendKeys("15");

	}	
	
}
