package selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggestiveDropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriver dr = new ChromeDriver();
		Thread.sleep(4000);
		dr.get("https://www.google.com/");
		dr.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> allopt = dr.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']"));
		
		
		for(int i=0; i<=allopt.size(); i++) 
		{
			String op = allopt.get(i).getText();
			System.out.println(op);
			Thread.sleep(1000);
			if(op.equals("selenium testing"))
			{
				Thread.sleep(2000);
				allopt.get(i).click();
				break;
			}
		}
		

	}

}
