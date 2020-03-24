package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("anjali");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kakade");
		
		List<WebElement> lb=d.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<lb.size();i++)
		{
			lb.get(i).click();
		}

	}

}
