package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Sign_in {

	 public WebDriver loginToSpotify() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdal\\Documents\\Selenium Webdrivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        try {
            driver.get("https://accounts.spotify.com/en-GB/login");
            driver.manage().window().maximize();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username"))).sendKeys("helive5192@prorsd.com");

            WebElement passWord = driver.findElement(By.id("login-password"));
            passWord.sendKeys("adminadmin1");
            
            
            WebElement nextButton1 = driver.findElement(By.id("login-button"));
            nextButton1.click();
            
            
            System.out.println("Logged In!!");
            Thread.sleep(2000);
            
            WebElement nextButton = driver.findElement(By.cssSelector("button[data-testid='web-player-link']"));
            nextButton.click();
            
            Thread.sleep(2000);
            	
        } catch (Exception e) {	
            e.printStackTrace();
        }           
        return driver;	
        
    }
}
