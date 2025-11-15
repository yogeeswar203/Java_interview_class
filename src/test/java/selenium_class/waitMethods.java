package selenium_class;

import java.sql.Time;
import java.time.Duration;
import java.time.temporal.TemporalUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr  = new ChromeDriver();
		dr.get("https://omayo.blogspot.com/");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait myWait  = new WebDriverWait(dr, Duration.ofSeconds(10));
		WebElement el  = dr.findElement(By.xpath("//form[@name='form1']//input[1]"));
		myWait.until(ExpectedConditions.elementToBeClickable(el));
		el.sendKeys("username1");
		
		Thread.sleep(10000);
		System.out.println("Driver is executed successfully");
		dr.quit();
		
		

	}

}
