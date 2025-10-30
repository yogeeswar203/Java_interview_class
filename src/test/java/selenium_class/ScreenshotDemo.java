package selenium_class;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File trgFile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage2.jpeg");
		srcFile.renameTo(trgFile);
		
		
		WebElement se = driver.findElement(By.xpath("//div[@class='RNNXgb']"));
		File srcFile2 = se.getScreenshotAs(OutputType.FILE);
		File trgFile2 = new File(System.getProperty("user.dir")+"\\screenshots\\search_box.jpeg");
		srcFile2.renameTo(trgFile2);
			
		System.out.println("Both Screenshots are taken");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
