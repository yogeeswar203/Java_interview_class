package selenium_class;

import java.sql.Time;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datePickerDemo {

	public static void main(String[] args) throws Exception {
		WebDriver dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		dr.manage().window().maximize();
	
		dr.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/169");
		Thread.sleep(20000);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(50));
		WebElement e1 = dr.findElement(By.xpath("//label[text()='Employee Full Name']"));
		wait.until(ExpectedConditions.visibilityOf(e1));
		System.out.println("Waiting time is over..........");
		
		Thread.sleep(3000);
		WebElement dateField= dr.findElement(By.xpath("(//div[@class='oxd-date-input'])[1]//input"));
		
		
		
		
		
		//JavascriptExecutor js = (JavascriptExecutor)dr;
		//js.executeScript("arguments[0].click();", dateField);
		dateField.click();
		dateField.sendKeys("2026-10-26");
		
		Thread.sleep(5000);
		
	/*	
		
		
		String month ="May";
		String year = "2025";
		
		while(true)
		{
			Thread.sleep(2000);
			String monthField = dr.findElement(By.xpath("//li//div[@class='oxd-calendar-selector-month-selected']//p")).getText();
			String yearFiled = dr.findElement(By.xpath("//li//div[@class='oxd-calendar-selector-year-selected']//p")).getText();
			
			if(monthField.equals(month) && yearFiled.equals(year))
			{
				break;
			}
			//dr.findElement(By.xpath("(//div[@class='oxd-date-input-calendar']//button[@type='button'])[2]")).click(); // For clicking future month
			dr.findElement(By.xpath("(//div[@class='oxd-date-input-calendar']//button[@type='button'])[1]")).click(); // For clicking previous month
			
		}
		
		Thread.sleep(6000); 
		List<WebElement> alldates = dr.findElements(By.xpath("//div[@class='oxd-calendar-dates-grid']//div/div"));
		 String date = "26";
		 
		 for(WebElement day:alldates)
		 {
			 String act_date = day.getText();
			 if(act_date.equals(date))
			 {
				 day.click();
				 break;
			 }
		 }
	*/

	}

}
