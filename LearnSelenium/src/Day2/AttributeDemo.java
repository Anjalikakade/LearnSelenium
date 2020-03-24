package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeDemo 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.manage().window().maximize();//to maximize the window
		String str=driver.findElement(By.id("Email")).getAttribute("class");
		System.out.println("Attribute is:"+str);
		String str2=driver.findElement(By.id("Email")).getTagName();
		System.out.println("Tag Name is:"+str2);
		driver.findElement(By.id("Email")).sendKeys("anjalik2997@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Anjali");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		

	}

}
