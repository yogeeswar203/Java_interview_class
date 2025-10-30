package selenium_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_Selection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		dr.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(3000);
		
		WebElement options_ele = dr.findElement(By.xpath("//Select[@id='country']"));
		Select drpCountr = new Select(options_ele);
		drpCountr.selectByIndex(5);
		Thread.sleep(2000);
		drpCountr.selectByValue("usa");
		Thread.sleep(2000);
		drpCountr.selectByVisibleText("India");
		
		
		
		// Find the total no of items
		List<WebElement> allOptions = drpCountr.getOptions();
	
		for(WebElement op:allOptions)
		{
			System.out.println(op.getText());
		}
		
		System.out.println(allOptions.size()+" :All the options are printed");
		Thread.sleep(5000);
		dr.quit();     		

	}

}
