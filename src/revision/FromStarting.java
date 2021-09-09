package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromStarting {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://en-gb.facebook.com/");

    String title = driver.getTitle();
    System.out.println(title);

    //driver.close();
    //driver.quit();

    WebElement username = driver.findElement(By.id("email"));
    username.sendKeys("muk");

    WebElement password = driver.findElement(By.id("pass"));
    password.sendKeys("123");

    WebElement login = driver.findElement(By.name("login"));
    login.click();
    
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    
    
    
    
    
    
    
    
    
    
    
}
}
