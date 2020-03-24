package seleniumtest;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CorrectAss 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
		
		WebElement mouunthcount=d.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel= new Select(mouunthcount);
		sel.selectByIndex(2);
		
		List<WebElement> mounth=sel.getOptions();
		System.out.println(mounth.size());
		for(int i=1;i<mounth.size();i++)
		{
			System.out.println(mounth.get(i).getText());
		}
		
		WebElement year=d.findElement(By.xpath("//select[@id='yearbox']"));
		Select sel1=new Select(year);
		sel1.selectByValue("1916");
		
		List<WebElement> year1=sel1.getOptions();
		System.out.println(year1.size());
		for(int i=0;i<year1.size();i++)
		{
			System.out.println(year1.get(i).getText());
		}
		WebElement day=d.findElement(By.xpath("//select[@id='daybox']"));
		Select sel2=new Select(day);
		sel2.selectByVisibleText("1");
		
		List<WebElement> day1=sel2.getOptions();
		System.out.println(day1.size());
		for(int i=0;i<day1.size();i++)
		{
			System.out.println(day1.get(i).getText());
		}
		
		
	
	}

	
	
}
