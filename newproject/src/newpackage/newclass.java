package newpackage;

import org.openqa.selenium.WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class newclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");  
		driver.manage().window().maximize();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.close();
	    driver.quit();
	}

}
