package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class clear_data_text {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2500);
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");;
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");;
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(2000);
		
		WebElement e1 = dr.findElement(By.xpath("(//label[text()='Employee Id']/../following::input)[1]"));
	
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].value = '';", e1);
		Thread.sleep(2000);
		e1.sendKeys("025");
		
		

	}

}
