package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//open in firefox
		System.setProperty("webdriver.gecko.driver","E:\\Jar files\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//open in chrome
		//System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		boolean checkpresence=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
		
		boolean checkenable=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenable);
		if( checkpresence==true && checkenable==true)
		{
			driver.findElement(By.id("Email")).sendKeys("anjali23@gmail.com");
		}
		Thread.sleep(3000);
		driver.close();

	}

}
