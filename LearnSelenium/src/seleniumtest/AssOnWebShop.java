package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class AssOnWebShop 
{

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.get("http://demowebshop.tricentis.com/login");
		
		
		
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		System.out.println(actualresult.length());
		
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		String expurl="http://demowebshop.tricentis.com/login";
		if( expurl.equals( actualurl))
		{
			System.out.println("Correst page");
		}
		else
		{
			System.out.println("Incorrect Page");
		}
		
		String code=driver.getPageSource();
		System.out.println(code);
		System.out.println(code.length());
		//driver.close();
	}

}
