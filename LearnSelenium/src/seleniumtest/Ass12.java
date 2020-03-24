package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass12 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("anjali");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kakade");
		d.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("county road");
		d.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("anjali@gmail.com");
		d.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("1234567896");
		Select dropdown=new Select(d.findElement(By.id("Skills")));
		dropdown.selectByVisibleText("CSS");
		
		Select dp=new Select(d.findElement(By.id("countries")));
		dp.selectByVisibleText("India");
		
		
		
		d.findElement(By.xpath("//div[@id='msdd']")).click();
		 d.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
		 d.findElement(By.xpath("//a[contains(text(),'Catalan')]")).click();
		 

		 d.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
		d.findElement(By.id("checkbox2")).click();
		
		
		d.findElement(By.id("firstpassword")).sendKeys("Anjali@123");
		d.findElement(By.id("secondpassword")).sendKeys("Anjali@123");
		
		//d.findElement(By.xpath("//button[@id='submitbtn']")).click();
		//d.findElement(By.xpath("//button[@id='Button1']")).click();
		
	}

}
