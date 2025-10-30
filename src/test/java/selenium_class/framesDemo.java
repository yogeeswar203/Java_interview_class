package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesDemo {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(5000);
		WebElement frame_element = dr.findElement(By.xpath("//frame[@src='frame_1.html']"));
		dr.switchTo().frame(frame_element);
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Text Entered");
		
		System.out.println("The Tesxt is entered on Text BOX and This is Frame");
		
		
		Thread.sleep(1000);
		
	}

}
