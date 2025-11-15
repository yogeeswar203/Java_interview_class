package selenium_class;

import java.sql.Time;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
		/*
		 * dr.get("https://omayo.blogspot.com/"); dr.manage().window().maximize();
		 * Thread.sleep(1000);
		 * dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * 
		 * WebElement el = dr.findElement(By.xpath("//form[@name='form1']//input[1]"));
		 * 
		 * 
		 * // Implicit wait
		 * dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * // Explicit wait WebDriverWait myWait = new WebDriverWait(dr,
		 * Duration.ofSeconds(15)); myWait.until(ExpectedConditions.visibilityOf(el));
		 * 
		 * el.sendKeys("test@gmal.com");
		 * 
		 * 
		 * String winID = dr.getWindowHandle();
		 * System.out.println("Current window ID is: "+winID);
		 * 
		 * WebElement windidEl =
		 * dr.findElement(By.xpath("//a[text()='Open a popup window']"));
		 * windidEl.click();
		 * 
		 * Set<String> set= dr.getWindowHandles(); List<String> set1 = new
		 * ArrayList<String>(set); String p1 = set1.get(0); String p2 = set1.get(1);
		 * 
		 * dr.switchTo().window(p2);
		 * 
		 * String newWind =
		 * dr.findElement(By.xpath("//h3[text()='New Window']")).getText();
		 * System.out.println("New Window text is: "+newWind); dr.switchTo().window(p1);
		 * for(String wl:set) { String title = dr.getTitle(); System.out.println(title);
		 * }
		 * 
		 * Thread.sleep(5000); System.out.println("Driver is executed successfully");
		 */
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement e1 = dr.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		
		WebDriverWait mywait  = new WebDriverWait(dr, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOf(e1));
		e1.click();
		
		Set<String> windId = dr.getWindowHandles();
		List<String> wind = new ArrayList<String>(windId);
		String c1 = wind.get(0);
		String c2 = wind.get(1);
		System.out.println("Wind ID1: "+c1);
		System.out.println("Wind ID1: "+c2);
		
		dr.switchTo().window(c2);
		System.out.println(dr.getTitle());
		Thread.sleep(5000);
		dr.quit();
		
		

	}

}
