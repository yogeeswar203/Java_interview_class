package selenium_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class drp_hidden {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[text()='Account Assistant']")).click();
		List<WebElement>allOptions_jobTitle = dr.findElements(By.xpath("//div[@role='option']"));
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(2000);
		for(WebElement op:allOptions_jobTitle)
		{
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(4000);
		dr.quit();
		

	}

}
