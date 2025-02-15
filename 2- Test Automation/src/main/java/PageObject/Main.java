package PageObject;

import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        // Perform login and get the WebDriver instance
    	try {
    
        Sign_in signIn = new Sign_in();
        WebDriver driver = signIn.loginToSpotify();
        
        Thread.sleep(1000);

        AddtoPlayList addToPlaylist = new AddtoPlayList();
        addToPlaylist.createPlaylist(driver);
    }
    
    catch (InterruptedException e)
    {
    	 e.printStackTrace();
    }
}
}
