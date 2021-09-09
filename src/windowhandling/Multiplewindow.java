package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		
		a.get("https://en-gb.facebook.com/");
		a.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement b  = a.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));		
        b.sendKeys("mukesh11398@gmail.com");
		b.click();
		
		Thread.sleep(3000);
		Set<String> all = a.getWindowHandles();

}
}