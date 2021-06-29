package Test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskone {
            
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.firefoxdriver().setup();
//Url launching
		WebDriver driver=new FirefoxDriver();
	    driver.get("http://automationpractice.com/index.php");
	
	
// current url
   System.out.println("Current url of the page:"+driver.getCurrentUrl());

// title page
   System.out.println("Title of the  page"+driver.getTitle());
	
   Thread.sleep(1000);
   
// Navigate
   driver.navigate().to("https://www.nexchar.com/");
    
   Thread.sleep(5000);
   
 // Refresh page
   driver.navigate().refresh();
	
	
	
	}
	
}

