package selenium_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class mouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://testautomationpractice.blogspot.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.manage().window().maximize();
		
		// Explicit wait
		/*
		 * WebDriverWait mywait = new WebDriverWait(dr, Duration.ofSeconds(10));
		 * mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		 * 
		 * WebElement popWindow = dr.findElement(By.xpath("//button[contains(text(), 'New Tab')]"));
		
		popWindow.click();
		popWindow.click();
		
		dr.getWindowHandle();
		
		List<String>windIds = new ArrayList<String>(dr.getWindowHandles());
		System.out.println(windIds);
		dr.switchTo().window(windIds.get(2));
		Thread.sleep(4000);
		dr.findElement(By.xpath("(//a[contains(text(),'API Testing ')])[1]")).click();
		
		System.out.println(dr.getWindowHandle());
		dr.switchTo().defaultContent();
		dr.switchTo().parentFrame();
		
		alert1.click();
		Thread.sleep(2000);
		dr.switchTo().alert().accept();
		System.out.println("Driver accepted the alert");
		
		alert2.click();
		Thread.sleep(2000);
		dr.switchTo().alert().accept();
		System.out.println("Driver accepted the alert");
		Thread.sleep(2000);
		alert2.click();
		Thread.sleep(2000);
		dr.switchTo().alert().dismiss();
		System.out.println("Driver Dismissed the alert");
		
		alert3.click();
		Thread.sleep(2000);
		dr.switchTo().alert().sendKeys("This");
		Alert ale = dr.switchTo().alert();
		Thread.sleep(2000);
		ale.accept();
		Alert at =wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		at.accept();
		System.out.println(dr.findElement(By.xpath("//p[contains(@id,'demo')]")).getText());
		
		//WebElement onl = dr.findElement(By.xpath("(//a[text()='Self Paced Video Course'])[2]"));
		
		WebElement alert1 = dr.findElement(By.xpath("//button[contains(text(),'Simple Alert')]"));
		WebElement alert2 = dr.findElement(By.xpath("//button[contains(text(),'Confirmation Alert')]"));
		WebElement alert3 = dr.findElement(By.xpath("//button[contains(text(),'Prompt Alert')]"));
		
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
		
		 * 
		 * 
		 */
		
		
		WebElement optDrop = dr.findElement(By.xpath("//select[contains(@id,'country')]"));
		Select opt = new Select(optDrop);
		
		opt.selectByIndex(1);
		
		List<WebElement>allOptions = opt.getOptions();
		
		
		
		for(WebElement op:allOptions)
		{
			String s=op.getText();
			if(op.equals("India"))
			{
				opt.selectByVisibleText(s);
			}
		}
		
		
		
		Thread.sleep(10000);
		dr.quit();

	}

}
