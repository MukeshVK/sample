package selectalliteminapage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samp1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	
	a.get("https://www.amazon.in/");
	a.manage().window().maximize();
	
	a.findElement(By.id("twotabsearchtextbox")).sendKeys("mouse");
	a.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);

	
	//List<WebElement> li = a.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	
	WebElement c = a.findElement(By.xpath("//span[text()='Logitech M235 Wireless Mouse, 2.4 GHz with USB Unifying Receiver, 1000 DPI Optical Tracking, 12 Month Life Battery, Compatible with Windows, Mac, Chromebook/PC/Laptop - Blue']"));
System.out.println(c.getText());
	//	for(int i=0;i<li.size();i++) {
	//	System.out.println(li.get(i).getText());
	
		//for (WebElement x : li) {
			//System.out.println(x.getText());
		}
		
		
	}

