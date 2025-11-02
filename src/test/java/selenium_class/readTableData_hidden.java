package selenium_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readTableData_hidden {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[text()='Admin']")).click();
		dr.findElement(By.xpath("//span[text()='Admin']")).click();
		dr.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> roles = dr.findElements(By.xpath("//div[@role='option']//span"));
		
		
		for(WebElement op:roles)
		{
			String s = op.getText();
			if(s.equals("Admin"))
			{
				op.click();
				break;
			}
		}
		
		Thread.sleep(4000);
		dr.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		
		List<WebElement> status = dr.findElements(By.xpath("//div[@role='option']//span"));

		for(WebElement op1:status)
		{
			String s = op1.getText();
			if(s.equals("Enabled"))
			{
				op1.click();
				break;
			}
		}
		
		dr.findElement(By.xpath("//button[text()=' Search ']")).click();
		
		Thread.sleep(2000);
		List<WebElement> data = dr.findElements(By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])//div"));
		for(WebElement data1:data)
		{
			String text = data1.getText();
			//char c = text.charAt(0);
			
			if(!String.valueOf(text).isBlank() || !String.valueOf(text).isEmpty())
			{
				System.out.print(text+" ");
			}
			
		}
		Thread.sleep(10000);
		dr.quit();
	}
}
