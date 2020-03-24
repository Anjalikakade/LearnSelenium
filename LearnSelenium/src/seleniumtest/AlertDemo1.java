package seleniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		
		Thread.sleep(30000);
		alert.dismiss();
		
		
		Thread.sleep(30000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert1=driver.switchTo().alert();
		
		alert1.sendKeys("Anjali");

	}

}
