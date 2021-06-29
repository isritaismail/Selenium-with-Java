package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {
               public static void main(String[] args) throws InterruptedException {
            	   
				 WebDriverManager.firefoxdriver().setup();
            	 WebDriver driver= new FirefoxDriver();
            	 //url
            	 driver.get(" https://katalon-demo-cura.herokuapp.com/");
            	 
            	 // button click
            	 driver.findElement(By.id("btn-make-appointment")).click();
            	 
            	 //login
            	 driver.findElement(By.id("txt-username")).sendKeys("John Doe");
            	 driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
            	 
            	// login button click
            	 driver.findElement(By.id("btn-login")).click();
            	 
            	 Thread.sleep(1000);
            	 
               //close browser
            	 driver.quit();
			}
}
