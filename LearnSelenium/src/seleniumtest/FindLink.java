package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLink 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("No od links Are:"+link.size());
		for(int i=0;i<link.size();i++)
		{
			System.out.println("Links Are :"+link.get(i).getText());
		}
		List<WebElement> div=driver.findElements(By.tagName("div"));
		System.out.println(div.size());
		driver.close();
		
		
	}

}
