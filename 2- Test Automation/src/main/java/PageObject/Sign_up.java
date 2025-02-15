package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Sign_up {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdal\\Documents\\Selenium Webdrivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Step 1: Sign up on Spotify
            driver.get("https://www.spotify.com/");
            driver.manage().window().maximize();

            // Fill in the signup form
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"global-nav-bar\"]/div[3]/div[2]/button[1]"))).click();
         
          
            
            WebElement emailid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            emailid.sendKeys("dutobsmwyg@wywnxa.com");
            Thread.sleep(1000);
            emailid.sendKeys(Keys.ENTER);

           
            
            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("new-password")));
            passwordInput.sendKeys("adminadmin1");
            Thread.sleep(1000);
            passwordInput.sendKeys(Keys.ENTER);	
            
            // WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button")));
           // nextButton.click();
           
          
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("displayName"))).sendKeys("Admin admin");       
            Thread.sleep(500);
            driver.findElement(By.id("day")).sendKeys("01");
            driver.findElement(By.id("month")).click();
            driver.findElement(By.xpath("//*[@id=\"month\"]/option[2]")).click();
            Thread.sleep(500);
            WebElement next = driver.findElement(By.id("year"));
            next.sendKeys("1990");
            
            driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[3]/fieldset/div/div/div[1]/label")).click();

            driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button")).click();

            Thread.sleep(1000);
            
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button"))).click();    
            
            
            Thread.sleep(10000);
            	
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}