package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		
		a.get("https://www.amazon.in/s?k=mobile&i=electronics&ref=nb_sb_noss_2");
		a.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement b  = a.findElement(By.xpath("//span[text()='Redmi 9A (Nature Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery']"));		
        String parent = a.getWindowHandle();
		b.click();
		
		Thread.sleep(3000);
		Set<String> all = a.getWindowHandles();
		
		for (String x : all) {
			
			if(!x.equals(parent))
			{
				a.switchTo().window(x);
			}
		
		
	String c = a.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();
	System.out.println(c);
		}
	}
	}
	
