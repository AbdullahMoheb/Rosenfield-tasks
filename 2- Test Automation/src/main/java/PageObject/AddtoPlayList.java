package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class AddtoPlayList {

	 public void createPlaylist(WebDriver driver) {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            
        	// Search for the first song ( Sad by XXXTENTACION )
        	 WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-testid='search-input']")));
             searchBar.sendKeys("SAD!");
             searchBar.sendKeys(Keys.ENTER);

             // Filter by Songs 
             WebElement allElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/div[4]/div/div/div[2]/div[2]/div/main/div[1]/div/div/div[1]/div/a[3]/button")));
             allElement.click();
             Thread.sleep(500);
             
             // Select Sad Song
             WebElement SongElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"searchPage\"]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/a")));
             SongElement.click();
             Thread.sleep(500);
             
             // Select dots for options 
             WebElement moreoptions = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/div[4]/div/div/div[2]/div[2]/div/main/section/div[3]/div[2]/div/div/button[2]")));
             moreoptions.click();
             Thread.sleep(200);
             
             // Select add to playlist from menu
             WebElement addtoplaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"context-menu\"]/ul/li[1]/button/div/span")));
             addtoplaylist.click();
           
             //	Select NewPlaylist
             WebElement newplaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tippy-3\"]/ul/div/li[2]/button")));
             newplaylist.click();
             Thread.sleep(1000);
             
             //search for another song       
             WebElement searchfornext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"global-nav-bar\"]/div[2]/div/div/span/div/form/div[2]/input")));          
             searchfornext.sendKeys("nekhaby leh");
             searchfornext.sendKeys(Keys.ENTER);
             
             
             WebElement selectnext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"searchPage\"]/div/div/section[1]/div[2]/div/div/div/div[4]")));
             selectnext.click();
             Thread.sleep(500);
             
             WebElement addtoplaylistn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/div[4]/div/div/div[2]/div[2]/div/main/section/div[3]/div[2]/div/div/button[2]/span")));
             addtoplaylistn.click();
           
             
             WebElement laylist2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"context-menu\"]/ul/li[1]/button")));
             laylist2.click();
          
           
             WebElement playlist2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tippy-6\"]/ul/div/li[3]/button")));
             playlist2.click();
             Thread.sleep(500);
             
             // Go to playlist from your library button from side panel
             WebElement Gotoplaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Desktop_LeftSidebar_Id\"]/nav/div/div[1]/div[2]/div[2]/div/div/ul/div")));
             Gotoplaylist.click();
             
             
             // play the playlist 
             WebElement playplaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/div[4]/div/div/div[2]/div[2]/div/main/section/div[2]/div[2]/div[2]/div/div/div[1]/button")));
             playplaylist.click();
             
        } catch (Exception e) {
            e.printStackTrace();
        } 
       
    }
}
