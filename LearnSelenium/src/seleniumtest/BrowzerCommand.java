package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowzerCommand {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.get("http://demowebshop.tricentis.com/login");
		
		
		
		driver.findElement(By.id("Email")).sendKeys("anjalik2997@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Anjali");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
		String expectedresult="Demo Web Shop";
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		
		if( expectedresult.equals(actualresult))
		{
			System.out.println("Correst page");
		}
		else
		{
			System.out.println("Incorrect Page");
		}
		driver.findElement(By.linkText("Log out")).click();
		//driver.findElement(By.xpath("//a[@class='ico-logout']")).click();	
		driver.close();//to close currrent instance of browzer

	}

}
